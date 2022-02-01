package core.basesyntax.entity;

public class IsoscelesTrapezoid extends Figure{
    private double base;
    private double top;
    private double leg;

    public IsoscelesTrapezoid(double base, double top, double leg, Color color) {
        this.base = base;
        this.top = top;
        this.leg = leg;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area:"
                + getArea() + ", top: " + top
                + " units, base: " + base + " units, "
                + "leg: " + leg + " units, "
                + "color: " + this.color);
    }

    @Override
    public double getArea() {
        double baseLeg = (base - top) / 2;
        double height = Math.sqrt(leg * leg - baseLeg * baseLeg);
        double middleLine = (base + top) / 2;
        return middleLine * height;
    }
}
