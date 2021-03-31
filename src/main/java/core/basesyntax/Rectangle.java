package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super("Rectangle", color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String draw() {
        return "Figure: " + getFigureName() + ", area: " + getArea()
                + " sq. units, side 1: " + length + " units, side 2: "
                + width + " units, color: " + getFigureColor();
    }
}
