package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private final int base;
    private final int top;
    private final int leg;

    public IsoscelesTrapezoid(Color color, int base, int top, int leg) {
        super(color);
        this.base = base;
        this.top = top;
        this.leg = leg;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return (double) (base + top + 2 * leg) / 2;
    }

    @Override
    public String toString() {
        String color = getColor().name().toLowerCase();
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, base: " + base
                + " units, top: " + top
                + " units, leg: " + leg
                + " units, color: " + color;
    }
}
