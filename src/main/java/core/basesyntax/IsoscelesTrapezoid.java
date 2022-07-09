package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    int base;
    int top;
    int leg;

    public IsoscelesTrapezoid(String color, int base, int top, int leg) {
        super(color);
        this.base = base;
        this.top = top;
        this.leg = leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + calculateArea()
                           + " sq.units, base: " + base + " units, top: "
                           + top + " units, leg: " + leg + " units, color:"
                           + color);
    }

    @Override
    public double calculateArea() {
        double height = Math.sqrt(Math.pow(leg, 2) - Math.pow(base - top, 2));
        return (base + top) / 2.0 * height;
    }
}
