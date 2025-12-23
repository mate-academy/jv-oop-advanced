package core.basesyntax;

public class Rectangle extends Figure {
    private final double side1;
    private final double side2;

    public Rectangle(double side1, double side2, String color) {
        super(color);
        if (side1 <= 0 && side2 <= 0) {
            throw new IllegalArgumentException("Sides rectangle must be greater than 0");
        }
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public String getTypeFigure() {
        return "Rectangle";
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + getArea()
                + " sq. units" + " with side 1: " + getSide1()
                + " units, side 2: " + getSide2()
                + " units" + " color: " + getColor();
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }
}
