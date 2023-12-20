package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double height;
    private double base;

    public RightTriangle(String color, double height, double base) {
        this.color = color;
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 1.0 / 2.0 * base * height;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: RightTriangle, area: "
                + Math.round(calculateArea() * 10.0) / 10.0 + " units, height: "
                + height + " units, base: " + base + " units, color: " + color.toLowerCase());
    }
}
