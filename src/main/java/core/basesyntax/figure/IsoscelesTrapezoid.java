package core.basesyntax.figure;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;

public class IsoscelesTrapezoid extends Figure {
    private int leg;
    private int base;
    private int top;

    public IsoscelesTrapezoid(Color color, int leg, int base, int top) {
        super(FigureType.TRAPEZOID, color);
        this.leg = leg;
        this.base = base;
        this.top = top;
    }

    @Override
    public double getArea() {
        return 0.25 * Math.sqrt(
                Math.pow(base + top, 2) * (base - top + 2 * leg) * (top - base + 2 * leg)
        );
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, "
                        + "area: %.1f sq. units, "
                        + "leg: %d units, base: %d units, top: %d units, "
                        + "color: %s",
                getType().name().toLowerCase(),
                getArea(),
                leg, base, top,
                getColor().name().toLowerCase()
        ));
    }
}
