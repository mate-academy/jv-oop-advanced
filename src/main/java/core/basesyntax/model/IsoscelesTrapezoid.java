package core.basesyntax.model;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(Color color, int sideA, int sideB, int height) {
        super(color);
        this.type = FigureType.ISOSCELES_TRAPEZOID;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameByType()
                + ", area: " + getArea() + " sq.units, side_A: "
                + sideA + ", side_B: " + sideB + ", height: " + height
                + ", color: " + getStringColor());
    }
}
