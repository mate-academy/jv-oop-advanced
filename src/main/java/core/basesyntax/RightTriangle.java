package core.basesyntax;

public class RightTriangle extends Figure {
    private double oneSide;
    private double twoSide;

    public double getOneSide() {
        return oneSide;
    }

    public double getTwoSide() {
        return twoSide;
    }

    public void setOneSide(double oneSide) {
        this.oneSide = oneSide;
    }

    public void setTwoSide(double twoSide) {
        this.twoSide = twoSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + " units, "
                + "first side: " + oneSide + " units," + " second side: " + twoSide
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return (oneSide * twoSide) / 2;
    }
}
