package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle (double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.figureName = FigureName.RightTriangle;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: " + figureName + ", "
                + "area: " + getArea() + " sq. units, "
                + "firstLeg: " + firstLeg + ", secondLeg: " + secondLeg
                + ", color: " + color;
    }
}
