package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double HALF = 0.5;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        if (firstLeg <= 0 || secondLeg <= 0) {
            throw new IllegalArgumentException("Legs must be greater than 0");
        }
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return HALF * firstLeg * secondLeg;
    }

    @Override
    public String getTypeFigure() {
        return "Right Triangle";
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + getArea()
                + " sq. units, first leg: " + getFirstLeg()
                + " units, second leg: " + getSecondLeg()
                + " units, color: " + getColor();
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }
}
