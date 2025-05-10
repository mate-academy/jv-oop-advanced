package core.basesyntax.model;

import core.basesyntax.enums.Color;

public class RightTriangle extends Figure {
    private final double base;
    private final double height;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        super(color);
        this.base = firstLeg;
        this.height = secondLeg;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, base: " + base
                + " units, height: " + height + " units, color: " + getColor());
    }
}
