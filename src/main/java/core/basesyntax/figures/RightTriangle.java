package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double height;
    private double base;

    public RightTriangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: RightTriangle, area: "
                + Math.round(calculateArea() * 10.0) / 10.0 + " units, height: "
                + (int)height + " units, base: " + (int)base + " units, color: "
                + color.toLowerCase());
    }
}
