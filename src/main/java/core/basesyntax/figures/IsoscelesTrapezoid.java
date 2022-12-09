package core.basesyntax.figures;

import core.basesyntax.Color;

public class IsoscelesTrapezoid extends Figure {
    private int lowerSide;
    private int upperSide;
    private int high;
    private String name = "Isosceles Trapezoid";

    public IsoscelesTrapezoid(Color color, int lowerSide, int upperSide, int high) {
        super(color);
        this.lowerSide = lowerSide;
        this.upperSide = upperSide;
        this.high = high;
    }

    @Override
    public double getArea() {
        return (lowerSide * upperSide) / 2 * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + "sq.units, lower side: " + lowerSide + ", upper side: "
                + upperSide + ", high: " + high + ", color: " + getColor());
    }
}
