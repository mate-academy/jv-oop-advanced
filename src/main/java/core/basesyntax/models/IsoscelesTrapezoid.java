package core.basesyntax.models;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double side;
    private final double bottom;
    private final double top;

    public IsoscelesTrapezoid(String color, double side, double bottom, double top) {
        super(color);
        this.side = side;
        this.bottom = bottom;
        this.top = top;
    }

    @Override
    public double getArea() {
        return ((bottom + top) / 4) * Math.sqrt(4 * side * side - Math.pow((bottom - top), 2));
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: isosceles trapezoid, area: %.1f sq. units, side: %.1f units,"
                + " bottom: %.1f units, top: %.1f units, color: %s\n",
                this.getArea(),
                this.side,
                this.bottom,
                this.top,
                this.getColor()
        );
    }
}
