package core.basesyntax;

public class RightTriangle extends Figure {

    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public double getPerimeter() {
        return firstLeg + secondLeg + getHeight();
    }

    @Override
    public double getHeight() {
        return Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: rightTriangle, area: %.1f sq. units, perimeter: %.1f units, "
                        + "firstLeg: %.1f units, secondLeg: %.1f units, height: %.1f units,"
                        + " color: %s%n", getArea(), getPerimeter(), getFirstLeg(), getSecondLeg(),
                getHeight(), getColor());
    }
}
