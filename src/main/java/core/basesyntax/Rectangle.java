package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + areaCalculator() + " firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg + ", color: " + getColor());
    }

    @Override
    public double areaCalculator() {
        return firstLeg * secondLeg;
    }
}
