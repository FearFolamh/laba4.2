import java.util.ArrayList;


class ComplexNumber
{
    double real, imaginary;
    public  ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber add(ComplexNumber other)
    {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal,newImaginary);
    }
    @Override
    public String toString()
    {
        return real+" + "+imaginary+" i";
    }
}
class Main
{
    public static void main(String[] args)
    {
        ComplexNumber ComplexNumber1 = new ComplexNumber(3,7);
        ComplexNumber ComplexNumber2 = new ComplexNumber(4,3);
        ComplexNumber sum =ComplexNumber1.add(ComplexNumber2);
        System.out.println(ComplexNumber1);
        System.out.println(ComplexNumber2);
        System.out.println(sum);
    }
}