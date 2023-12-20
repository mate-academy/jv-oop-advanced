package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setFigureName(FigureName.RightTriangle);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getFigureName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "firstLeg: " + firstLeg + ", secondLeg: " + secondLeg
                + ", color: " + this.getColor();
    }
}
