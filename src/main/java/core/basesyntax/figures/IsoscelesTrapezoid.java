package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int base;
    private final int side;
    private final int height;
    private final String color;

    public IsoscelesTrapezoid(int side, int base, int height, String color) {
        this.side = side;
        this.base = base;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid" + ", area: " + area() + " sq. units"
                + ", sideUp: " + side + " units, " + "sideDown: " + base + " units, "
                    + "height: " + height + " units," + "color: " + color);
    }

    @Override
    public double area() {
        return ((double) (side + base) / 2) * height;
    }
}
