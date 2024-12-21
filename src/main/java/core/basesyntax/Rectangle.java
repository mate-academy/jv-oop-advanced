package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private String color;
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String describe() {
        return "Rectangle " + getColor() + " length: " + length + " width: "
                + width + " area: " + getArea();
    }
}
