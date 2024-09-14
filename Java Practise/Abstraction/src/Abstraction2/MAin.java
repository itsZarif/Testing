package Abstraction2;

public class MAin {
    public static void main(String[] args) {
        Shape sp;
        sp = new Rectangle(10,20);
        sp.Area();

        sp = new Circle(10);
        sp.Area();

        sp = new Triangle(10, 20);
        sp.Area();
    }
}
