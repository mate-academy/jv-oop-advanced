package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double high;

    public void setSide(double firstSide, double secondSide, double high) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.high = high;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getHigh() {
        return high;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) * high * 0.5;
    }

    @Override
    public void drawArea() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, first side: "
                + getFirstSide() + " units, second side: " + getSecondSide()
                + " units, high: " + getHigh() + " units, color: " + getColor());
    }
}
