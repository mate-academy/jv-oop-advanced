package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width, Color color) {
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
        System.out.println("Area: " + getArea() + ", Length: " + length
                + ", Width: " + width + ", Color: " + color);
    }
}
