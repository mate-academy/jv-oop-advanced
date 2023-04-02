package core.basesyntax.figure;

import core.basesyntax.Color;

public class RightTriangle extends Figure {
    private final double height;
    private final double base;

    public RightTriangle(Color color, double base, double height) {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + area()
                + " sq.units, base: " + base
                + " units, height: " + height
                + " units, color: " + color.toString().toLowerCase();
    }
}
