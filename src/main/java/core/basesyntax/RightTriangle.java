package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;

    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle"
                + ", area: " + getArea() + " sq.units"
                + ", first leg: " + this.firstLeg
                + ", second leg: " + this.secondLeg
                + ", color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg / 2.0;
    }
}
