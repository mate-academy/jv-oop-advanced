package core.basesyntax;

public class Rectangle extends Figure {
    private final double side1;
    private final double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;

    }

    @Override
    double getArea() {
        return side1 * side2;
    }

    @Override
    String getInfo() {
        return "Figure: isosceles trapezoid, area: " + getArea() + " sq.units, side1: " + side1
                + " side2: " + side2 + " units, color: " + getColor();
    }
}
