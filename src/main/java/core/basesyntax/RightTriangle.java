package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg = 0;
    private int secondLeg = 0;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq.units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }
}
