package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class IsoscelesTrapezoid extends Figure {
    private final int upperBase;
    private final int lowerBase;
    private final int height;

    public IsoscelesTrapezoid(Color color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) ((upperBase + lowerBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid: area - " + getArea()
                           + ", upper base - " + upperBase
                           + ", lower base - " + lowerBase
                           + ", height - " + height
                           + ", color - " + getColor().name()
                           + '.');
    }
}
