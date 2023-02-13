package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        area = 0.5 * firstLeg * secondLeg;
        return area;
    }

    @Override
    public String drawFigure() {
        System.out.println("Figure: rightTriangle,"
                + "area: " + Math.floor(area) + " sq.units, "
                + "firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units"
                + ", color: " + color.toString().toLowerCase());
        return null;
    }
}
