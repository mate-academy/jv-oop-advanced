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
        double halfDiff = Math.abs(bottom - top) / 2;
        double height = Math.sqrt(side * side - halfDiff * halfDiff);
        return ((bottom + top) / 2) * height;
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
