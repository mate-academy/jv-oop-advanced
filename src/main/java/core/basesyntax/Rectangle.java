package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle");
        System.out.println("Area: " + getArea() + " sq.units");
        System.out.println("Length: " + length + " units");
        System.out.println("Width: " + width + " units");
        System.out.println("Color: " + getColor());
    }
}
