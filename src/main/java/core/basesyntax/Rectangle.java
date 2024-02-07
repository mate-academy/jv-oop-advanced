package core.basesyntax;

public class Rectangle extends Figure {
    private int firLeg;
    private int secLeg;

    public Rectangle(String color, int firLeg, int secLeg) {
        super(color);
        this.firLeg = firLeg;
        this.secLeg = secLeg;
    }

    @Override
    public double getArea() {
        return firLeg * secLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: restangle, area: " + getArea() + " sq.units, width: "
                + firLeg + " unit, height: " + secLeg + " unit, color: " + getColor());
    }
}
