package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int base1;
    private final int base2;
    private final int leg;
    private final int altitude;

    public IsoscelesTrapezoid(int base1, int base2, int leg, int altitude, String color) {
        this.base1 = base1;
        this.base2 = base2;
        this.leg = leg;
        this.altitude = altitude;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return (altitude * (base1 + base2) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, base1: "
                + base1 + " units, base2: "
                + base2 + " units, leg: "
                + leg + " units, altitude: "
                + altitude + " units, color: "
                + getColor());
    }
}
