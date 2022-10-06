package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(DiffColor color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg / 2 * secondLeg;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + getColor().name().toLowerCase());
    }
}
