package core.basesyntax.model.impl;

import core.basesyntax.model.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int high;

    public IsoscelesTrapezoid(
            String color,
            int firstBase,
            int secondBase,
            int high) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.high = high;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (firstBase + secondBase) * high;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: isoscelesTrapezoid, area: %.2f sq. units, "
                        + "first base: %d units, second base: %d units, "
                        + "high: %d units, color: %s%n",
                calculateArea(), firstBase, secondBase, high, color
        );
    }
}
