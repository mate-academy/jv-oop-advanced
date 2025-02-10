package core.basesyntax;

public class Trapezoid extends Figure {
    private double baseLength;
    private  double lengthOfShortBase;
    private double height;

    public Trapezoid(double baseLength, double lengthOfShortBase, double height) {
        this.baseLength = baseLength;
        this.lengthOfShortBase = lengthOfShortBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseLength + lengthOfShortBase) * height;
    }
}
