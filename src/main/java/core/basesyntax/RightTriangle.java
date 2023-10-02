package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCalculator {
    private double firstLeg;
    private double secondLeg;
    public RightTriangle (String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String figureType() {
        return "RightTriangle";
    }
}
