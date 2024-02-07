package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double side;

    public Rectangle(double height, double side, String color) {
        super(color);
        this.height = height;
        this.side = side;
    }

    @Override
    public double getArea() {
        return 0.5 * side * height;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, side: " + side
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
