package core.basesyntax.figure;

import core.basesyntax.suppliers.Color;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(Color color, double side) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / (1 / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + "sq.units, base: " + base
                + "sq.units, height: " + height
                + "units, color: " + getColor());
    }
}
