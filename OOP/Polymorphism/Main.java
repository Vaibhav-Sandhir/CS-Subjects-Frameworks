public class Main{
    public static void main(String args[]){
        Figure f1 = new Rectangle(5, 6);
        Figure f2 = new Square(5);
        Figure f3 = new Triangle(4, 2);
        System.out.println(f1.area());
        System.out.println(f2.area());
        System.out.println(f3.area());
    }
}

public abstract class Figure{
    int length;
    int breadth;

    public Figure(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public abstract int area();
}

public class Rectangle extends Figure{

    public Rectangle(int length, int breadth){
        super(length, breadth);
    }

    @Override
    public int area(){
        return length * breadth;
    }
}

public class Square extends Rectangle{

    public Square(int length){
        super(length, length);
    }
}

public class Triangle extends Figure{

    public Triangle(int length, int breadth){
        super(length, breadth);
    }

    @Override
    public int area(){
        return (length * breadth) / 2;
    }
}