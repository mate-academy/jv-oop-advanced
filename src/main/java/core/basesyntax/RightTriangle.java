package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        super();
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, first leg "
                + firstLeg + " units, second leg: " + secondLeg + " units, color: " + color);
    }
}
