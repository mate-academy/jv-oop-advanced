package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "baseA: " + baseA + " units, "
                + "baseB: " + baseB + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
