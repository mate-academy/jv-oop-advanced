package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;

    private double high;

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double high) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.high = high;
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) * high;
    }
}
