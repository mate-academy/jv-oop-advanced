package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int upperBase;
    private final int bottomBase;

    public IsoscelesTrapezoid(Color color, int upperBase, int bottomBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (float) ((upperBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.unit, bottom base: " + bottomBase
                + " units, upper base: " + upperBase
                + " units, height: " + height + " units, color: "
                + getColor().name());
    }
}
