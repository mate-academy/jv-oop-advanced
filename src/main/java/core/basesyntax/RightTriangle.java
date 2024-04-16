package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private final String color;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.color = String.valueOf(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(getArea() + firstLeg +  secondLeg + color);
    }

    @Override
    public Color getColor() {
        return Color.valueOf(color);
    }
}
