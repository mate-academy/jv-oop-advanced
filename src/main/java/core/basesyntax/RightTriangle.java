package core.basesyntax;

public class RightTriangle extends Figure {
    private int firLeg;
    private int secLeg;

    public RightTriangle(String color, int firLeg, int secLeg) {
        super(color);
        this.firLeg = firLeg;
        this.secLeg = secLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firLeg * secLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq.units, firstLeg: "
                + firLeg + " unit, secondLeg: " + secLeg + " unit, color: " + getColor());
    }
}
