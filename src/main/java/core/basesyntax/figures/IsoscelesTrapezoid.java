package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(int baseA, int baseB, int height, String color) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        setColor(color);
    }

    @Override
    public double area() {
        return (baseA + baseB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + area() + " sq. units, "
                + "baseA: " + baseA + " units, "
                + "baseB: " + baseB + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
