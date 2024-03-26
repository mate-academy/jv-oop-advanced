package core.basesyntax.figures.geometric;

import core.basesyntax.figures.Figure;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + df.format(getArea()) + " sq. units, "
                + "base: " + base + " units, "
                + "height: " + height + " units, "
                + "color: " + color.toLowerCase());
    }
}
