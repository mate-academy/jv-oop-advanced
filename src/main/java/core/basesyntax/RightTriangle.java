package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double ONE_HALF = 0.5;
    private int firstLeg;
    private int secondLeg;

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return ONE_HALF * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea()
                + " sq.units, first leg: "
                + this.firstLeg
                + " units, second leg: "
                + this.secondLeg
                + " units, color: "
                + getColor());
    }
}
