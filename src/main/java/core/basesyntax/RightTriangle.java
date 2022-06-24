package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double K = 0.5;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void draw() {
        System.out.println("Figure: triangle, area: " + getAreaCalculator() + " sq.units,"
                + " firstLeg: " + firstLeg + " units,"
                + " secondLeg: " + secondLeg + " units,"
                + " color: " + color);
    }

    @Override
    public double getAreaCalculator() {
        return K * firstLeg * secondLeg;
    }
}
