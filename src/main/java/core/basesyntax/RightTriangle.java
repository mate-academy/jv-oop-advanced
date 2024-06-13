package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: RightTriangle, " + "area: " + this.getArea()
                            + " sq. units, first leg: " + this.firstLeg + " units, second leg: "
                            + this.secondLeg + ", color: " + super.getColor().name());
    }
}
