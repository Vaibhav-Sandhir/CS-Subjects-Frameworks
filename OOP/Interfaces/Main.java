import java.util.*;

public class Main{
    public static void main(String args[]){
        ByTwo o1 = new ByTwo();

        o1.setStart(5);
        System.out.println(o1.getNext());
        System.out.println(o1.getNext());
        o1.reset();
        o1.setStart(7);
        System.out.println(o1.getNext());
    }
}

public interface Series{
    public int getNext();
    public void reset();
    public void setStart(int start);
}

public class ByTwo implements Series{
    int start;
    int num;

    @Override
    public void setStart(int start){
        this.start = start;
        num = start;
    }

    @Override
    public void reset(){
        num = start;
    }

    @Override
    public int getNext(){
        num = num + 2;
        return num;
    }

}


