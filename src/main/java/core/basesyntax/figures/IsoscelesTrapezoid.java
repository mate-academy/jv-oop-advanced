package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int upperSide;
    private final int base;
    private final int leg;
    private final int height;

    public IsoscelesTrapezoid(String color, int base, int upperSide, int leg, int height) {
        super(color);
        this.base = base;
        this.upperSide = upperSide;
        this.leg = leg;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base + upperSide) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + ", base: " + base
                + ", upper side: " + upperSide
                + ", leg: " + leg
                + ", height: " + height
                + ", color: " + getColor());

    }
}
