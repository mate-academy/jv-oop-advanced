package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + getDecimalFormat().format(getArea())
                + " sq. units, side A: " + getDecimalFormat().format(sideA) + " units, side B: "
                + getDecimalFormat().format(sideB) + ", height: "
                + getDecimalFormat().format(height) + " color: " + getColor();
    }
}
