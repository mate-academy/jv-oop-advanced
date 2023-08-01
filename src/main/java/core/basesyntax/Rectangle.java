package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width, Color color) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, Color color) {
        this("Rectangle", length, width, color);
    }

    @Override
    public double getArea() {
        return Math.round(length * width * 100.0) / 100.0;
    }
}
