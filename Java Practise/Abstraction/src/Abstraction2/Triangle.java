package Abstraction2;

public class Triangle extends Shape{

    Triangle(double dim1, double dim2)
    {
        super(dim1, dim2);
    }
    void Area()
    {
        double result = 0.5 * dim1 * dim2;
        System.out.println("Rectangle Area: " + result);
    }
}
