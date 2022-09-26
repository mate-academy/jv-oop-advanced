package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firLeg;
    private int secLeg;
    private int height;

    public IsoscelesTrapezoid(String color, int firLeg, int secLeg, int height) {
        super(color);
        this.firLeg = firLeg;
        this.secLeg = secLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (firLeg + secLeg) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq.units, "
                + "firstBase: " + firLeg + " unit, secondBase: " + secLeg + " unit, height:"
                + height + " unit, color: " + getColor());
    }
}
