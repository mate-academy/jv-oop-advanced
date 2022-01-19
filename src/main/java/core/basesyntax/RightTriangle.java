package core.basesyntax;

public class RightTriangle extends Figure implements FigureProperties {
    private double firstLeg;
    private double secondLeg;
    ColorSupplier colorSupplier = new ColorSupplier();

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: right triangle. FirstLeg: " + firstLeg + " mm." + " SecondLeg: " + secondLeg +
                "mm. Area: " + getArea() + " sq.mm. Color: " + colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

}
