package core.basesyntax;

public class RightTriangle extends Figure implements HasBisector, Drawing {
    private double sideA;
    private double sideB;

    public RightTriangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public String getInformation() {
        return String.format("Shape: right triangle, area: %.3f sq. units, side A length: %s units,"
                + " side B length: %s units, bisector length: %.3f units, color: %s",
                getArea(), sideA, sideB, getBisector(), getColor());
    }

    @Override
    public void draw() {
        System.out.println(" You draw " + getColor() + " right triangle!");
    }

    @Override
    public double getBisector() {
        return Math.sqrt(2) * (sideB * sideA) / (sideB + sideA);
    }
}
