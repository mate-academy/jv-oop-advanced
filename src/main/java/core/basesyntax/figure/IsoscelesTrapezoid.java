package core.basesyntax.figure;

import core.basesyntax.Color;

public class IsoscelesTrapezoid extends Figure {
    private final int upperBase;
    private final int lowerBase;
    private final int height;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height, Color color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid{area: " + getArea() + " square units, "
                + "upper base = " + upperBase + ", lower base = " + lowerBase + ", height = "
                + height + ", color = " + getColor() + '}');
    }
}
