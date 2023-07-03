package core.basesyntax.figures;

import core.basesyntax.Color;

public class IsoscelesTrapezoid extends Figure {
    private final int upperBase;
    private final int bottomBase;
    private final int height;

    public IsoscelesTrapezoid(Color color, int upperBase, int bottomBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) ((upperBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, upper base: " + upperBase + " units, bottom base: " + bottomBase
                + " units, color: " + getColor().name());
    }
}
