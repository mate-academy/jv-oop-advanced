package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements GetArea {
    private int base1;
    private int base2;
    private int leg;

    public IsoscelesTrapezoid(int base1, int base2, int leg, Colour colour) {
        super(colour);
        this.base1 = base1;
        this.base2 = base2;
        this.leg = leg;
    }

    private double getAltitude() {
        return (Math.sqrt(base1 * base2));
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2 * Math.sqrt(base1 * base2));
    }

    @Override
    public void getDraw() {
        System.out.println("Isosceles trapezoid, area: " + getArea() + " square units, altitude: "
                + getAltitude() + " units, color: " + getColour());
    }
}
