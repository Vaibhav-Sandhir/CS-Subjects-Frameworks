import java.util.*;

public class Main{
    public static void main(String args[]){
        Buffer buffer = new Buffer(5);
        Thread producer = new Thread(new Producer(buffer));
        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();
    }
}

public class Buffer{
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;
    private Random random = new Random();

    public Buffer(int capacity){
        this.capacity = capacity;
        if(capacity >= 5){
            buffer.add(1);
            buffer.add(2);
            buffer.add(3);
        }
    }

    public void produce() throws InterruptedException{
        synchronized(this){
            
            while(buffer.size() == capacity){
                wait();
            }
            
            int item = random.nextInt(10);
            buffer.add(item);
            System.out.println(buffer);

            notify();
        }
    }

    public void consume() throws InterruptedException{
        synchronized(this){
            
            while(buffer.isEmpty()){
                wait();
            }

            int item = buffer.remove();
            System.out.println(buffer);

            notify();
        }
    }
}

public class Producer implements Runnable{
    private Buffer buffer;

    public Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        try{
            while(true){
                buffer.produce();
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}

public class Consumer implements Runnable{
    private Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        try{
            while(true){
                buffer.consume();
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}