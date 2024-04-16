package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private final String color;
    private final double length;
    private final double width;

    public Rectangle(double length, double width, Color color) {
        this.color = String.valueOf(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println(getArea() + length + width + color);
    }

    @Override
    public Color getColor() {
        return Color.valueOf(color);
    }
}
