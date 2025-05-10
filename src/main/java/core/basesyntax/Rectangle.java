package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String drawFigure() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, side a: "
                + sideA + " units, side b: " + sideB + " units, color: "
                + getColor();
    }
}
