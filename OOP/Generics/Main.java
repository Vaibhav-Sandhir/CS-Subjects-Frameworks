import java.util.*;

public class Q2{
    public static void main(String args[]){
        MyStack<Integer> stack = new MyStack<>(3);
        stack.push(3);
        stack.display();
        stack.push(2);
        stack.display();
        stack.pop();
        stack.display();
        stack.push(5);
        stack.display();
        stack.push(6);
        stack.display();
        stack.pop();
        stack.display();
    }
}

public class MyStack <T>{
    T arr[];
    int top = -1;

    @SuppressWarnings("unchecked")
    public MyStack(int n){
        this.arr = (T[]) new Object[n];
    }

    public boolean isFull(){
        return top == arr.length - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(T num){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }

        arr[++top] = num;
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        
                 
        return arr[top--];
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }

        return arr[top];
    }

    public void display(){
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}