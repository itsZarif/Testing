package Abstraction2;

public class Circle extends Shape{

    Circle(double r)
    {
        super(r,r);
    }
    void Area()
    {
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle Area: " + result);
    }
}
