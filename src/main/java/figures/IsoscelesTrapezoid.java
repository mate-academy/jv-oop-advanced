package figures;

import behavior.ColorSupplier;
import behavior.Figure;
import behavior.GetAreaAble;

public class IsoscelesTrapezoid extends Figure implements GetAreaAble {
    private final double side;
    private final double up;
    private final double base;
    private final String name = "Isosceles Trapezoid";

    private ColorSupplier colorSupplier = new ColorSupplier();

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
                + base + " units, color: " + colorSupplier.getRandomColor();
    }
}
