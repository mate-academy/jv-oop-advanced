package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double shortSide;
    private double longSide;
    private double trapezoidH;

    public IsoscelesTrapezoid(double shortSide, double longSide, double trapezoidH, Color color) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
        this.trapezoidH = trapezoidH;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: trapezoid, area: " + getArea()
                        + " sq. units, shortSide: " + this.shortSide
                        + " sq. units, longSide: " + this.longSide
                        + " units, h: " + this.trapezoidH
                        + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return ((longSide + shortSide) * trapezoidH) / 2;
    }
}
