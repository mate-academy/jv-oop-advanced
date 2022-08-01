package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstSide;
    private double secondSide;

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setOneSide(double oneSide) {
        this.firstSide = oneSide;
    }

    public void setTwoSide(double twoSide) {
        this.secondSide = twoSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + " units, "
                + "first side: " + firstSide + " units," + " second side: " + secondSide
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return (firstSide * secondSide) / 2;
    }
}
