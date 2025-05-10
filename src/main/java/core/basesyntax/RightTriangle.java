package core.basesyntax;

public class RightTriangle extends Figure {

    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {

    }

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double areaCalculator() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: right triangle, area: " + areaCalculator()
                + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + getColor());
    }
}
