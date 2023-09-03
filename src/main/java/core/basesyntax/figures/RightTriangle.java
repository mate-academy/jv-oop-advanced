package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class RightTriangle extends Figure {
    private double baseLeg;
    private double heightLeg;

    public RightTriangle(double baseLeg, double heightLeg, String color) {
        this.baseLeg = baseLeg;
        this.heightLeg = heightLeg;
        setColor(color);
    }

    @Override
    public double area() {
        return ((0.5) * baseLeg * heightLeg);
    }

    @Override
    public void draw() {
        System.out.print("Figure: right triangle, area: ");
        System.out.print(getDecimalFormat(area()));
        System.out.print(" sq.units, base leg: " + baseLeg + " units, height leg: "
                + heightLeg + " units, color: " + getColor());
        System.out.println();
    }
}
