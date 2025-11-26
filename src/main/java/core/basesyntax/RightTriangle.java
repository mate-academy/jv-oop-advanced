package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    protected String getParametersString() {
        return "firstLeg: " + String.format("%.2f", firstLeg)
                + " units, secondLeg: " + String.format("%.2f", secondLeg) + " units";
    }

}
