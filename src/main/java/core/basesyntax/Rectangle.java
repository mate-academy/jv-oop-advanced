package core.basesyntax;

public class Rectangle extends Figures {
    private int a;
    private int b;

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }


    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area:" + getArea()
                + " sq. units, side a: " + a
                + " units, side b: " + b
                + " units, color: " + getColor());
    }
}
