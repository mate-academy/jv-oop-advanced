package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, double firstLeg, double secondLeg, Color color) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this("RightTriangle", firstLeg, secondLeg, color);
    }

    @Override
    public double getArea() {
        return Math.round(0.5 * firstLeg * secondLeg * 100.0) / 100.0;
    }
}
