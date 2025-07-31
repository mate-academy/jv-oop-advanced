package core.basesyntax;

public class RightTriangle extends FigureParent {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        if (firstLeg <= 0 || secondLeg <= 0) {
            throw new IllegalArgumentException("legs must be positive.");
        }

        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle"
                + ", area: " + findArea() + " sq. units"
                + ", first leg: " + firstLeg + " units"
                + ", second leg: " + secondLeg + " units"
                + ", color: " + getColor());
    }

    @Override
    public double findArea() {
        return roundTo(firstLeg * secondLeg * 0.5);
    }
}
