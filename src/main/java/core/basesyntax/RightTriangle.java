package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private final double legRight;
    private final double legLeft;

    public RightTriangle(double legRight, double legLeft, Color color) {
        super(color);
        this.legRight = legRight;
        this.legLeft = legLeft;
    }

    @Override
    public double getArea() {
        return 0.5 * legRight * legLeft;
    }

    @Override
    public void draw() {
        System.out.println("Drawing: right triangle, area:"
                + getArea() + " square unit, rightleg.: " + legRight + " un.,"
                + " leftleg: " + legLeft + " unit, color: "
                + color);
    }
}
