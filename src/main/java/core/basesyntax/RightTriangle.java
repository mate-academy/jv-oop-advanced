package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Area: " + getArea() + ", First Leg: " + firstLeg
                + ", Second Leg: " + secondLeg + ", Color: " + getColor());
    }

    @Override
    public Color getColor() {
        return null;
    }
}
