package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getDecimalFormat().format(getArea())
                + " sq. units, side A: " + getDecimalFormat().format(sideA)
                + " units, side B: " + getDecimalFormat().format(sideB)
                + " units, color: " + getColor();
    }
}
