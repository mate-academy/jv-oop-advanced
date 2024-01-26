package core.basesyntax.Figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Color {
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        super.setColor(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Type: Isosceles Trapezoid, color: "
                + getColor()
                + " area: "
                + getArea()
                + ", upper base: "
                + upperBase
                + ", lower base: "
                + lowerBase);
    }
}
