package figures;

import behavior.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double up;
    private double base;
    private String name = "Isosceles Trapezoid";

    public IsoscelesTrapezoid(double side, double up, double base) {
        this.side = side;
        this.up = up;
        this.base = base;
    }

    @Override
    public double getArea() {
        return ((up + base) / 4)
                * Math.sqrt((4 * side * side)
                - ((up * up) - (2 * up * base)
                + (base * base)));
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, side: "
                + side + " units, up: " + up + " units, base: "
                + base + " units, color: " + getRandomColor();
    }
}
