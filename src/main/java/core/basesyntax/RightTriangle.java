package core.basesyntax;

public class RightTriangle extends Figure {
    private double shortSide;
    private double longSide;

    public RightTriangle(double shortSide, double longSide) {
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public double getArea() {
        return (longSide * shortSide) / 2;
    }
}
