package figures;

import behavior.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double side;
    private final double up;
    private final double base;

    public IsoscelesTrapezoid(String color, String name, double side, double up, double base) {
        super(color, name);
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
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, side: "
                + side + " units, up: " + up + " units, base: "
                + base + " units, color: " + getColor());
    }
}
