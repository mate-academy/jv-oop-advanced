package core.basesyntax;

public class Rectangle extends AbstractFigure implements Figure {
    private final Color color;
    private final double length;
    private final double width;

    public Rectangle(double length, double width, Color color) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Area: " + getArea() + ", Length: " + length +
                ", Width: " + width + ", Color: " + color);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
