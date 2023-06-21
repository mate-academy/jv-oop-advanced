package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(double base, double height, Color color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println("Figure: right triangle, area: "
                + decimalFormat.format(getArea())
                + " sq.units, base: "
                + (int) base
                +
                " units, height: "
                + (int) height
                + " units, color: "
                + getColor());
    }
}
