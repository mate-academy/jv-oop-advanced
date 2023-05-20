package core.basesyntax;

public class RightTriangle extends Figure {
    protected double firstLeg;
    protected double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getFigureArea() {
        return Math.round((firstLeg * secondLeg) / 2);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: right triangle, area: " + this.getFigureArea()
                + " sq.units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + color);

    }
}
