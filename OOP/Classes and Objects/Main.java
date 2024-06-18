//Representing Complex numbers as a class supporting addition and subtraction

public class Main{
    public static void main(String args[]){
        Complex c1 = new Complex(5, 6);
        Complex c2 = new Complex(8, 9);
        Complex c3 = Complex.add(c1, c2);
        System.out.println(c3);
    }
}

public class Complex{

    public double real_part;
    public double imaginary_part;

    public Complex(){
        this.real_part = 0.0;
        this.imaginary_part = 0.0;
    }

    public Complex(double real_part, double imaginary_part){
        this.real_part = real_part;
        this.imaginary_part = imaginary_part;
    }

    public static Complex add(Complex num1, Complex num2){
        Complex result = new Complex();
        result.real_part = num1.real_part + num2.real_part;
        result.imaginary_part = num1.imaginary_part + num2.imaginary_part;
        return result;
    }

    public static Complex subtract(Complex num1, Complex num2){
        Complex result = new Complex();
        result.real_part = num1.real_part - num2.real_part;
        result.imaginary_part = num1.imaginary_part - num2.imaginary_part;
        return result;
    }

    @Override
    public String toString(){
        String number = String.valueOf(this.real_part) + " + i" + String.valueOf(this.imaginary_part);
        return number;
    }
}