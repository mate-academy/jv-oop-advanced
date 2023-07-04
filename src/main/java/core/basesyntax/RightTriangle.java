package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle; area : " + getArea() + " sq.units, "
                + " first Leg : " + firstLeg + " units, "
                + " second Leg : " + secondLeg + " units, "
                + " color : " + getColor().name());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
