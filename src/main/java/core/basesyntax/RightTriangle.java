package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return Math.round((firstLeg * secondLeg) / 2);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor());

    }
}
