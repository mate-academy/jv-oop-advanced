package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double high;
    private double side;

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.high = firstLeg;
        this.side = secondLeg;
    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return (high * side) / 2;
    }
}
