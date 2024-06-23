import java.util.*;

public class Main{
    public static void main(String args[]){
        Stack stack = new Stack(3);
        stack.pop();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
    }
}

public class Stack{
    int arr[];
    int top = -1;

    public Stack(int n){
        arr = new int[n];
    }

    public void push(int num){
        try{
            isFull();
        }
        catch(StackFullException e){
            System.out.println(e);
            return;
        }

        arr[++top] = num;
    }

    public int pop(){
        try{
            isEmpty();
        }
        catch(StackEmptyException e){
            System.out.println(e);
            return -1;
        }

        int num = arr[top--];
        return num;
    }

    public int peek(){
        try{
            isEmpty();
        }
        catch(StackEmptyException e){
            System.out.println(e);
            return -1;
        }

        int num = arr[top];
        return num;
    }

    private void isFull() throws StackFullException{
        if(top == arr.length - 1){
            throw new StackFullException("Stack Overflow Error");
        }
    }

    private void isEmpty() throws StackEmptyException{
        if(top == -1){
            throw new StackEmptyException("Stack Underflow Error");
        }
    }

}

public class StackFullException extends Exception{
    public StackFullException(String msg){
        super(msg);
    }
}

public class StackEmptyException extends Exception{
    public StackEmptyException(String msg){
        super(msg);
    }
}

