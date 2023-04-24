package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(Color color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: ISOSCELES TRAPEZOID, area: "
                + getArea()
                + " sq.units, "
                + "side A: "
                + sideA
                + " units,"
                + "side B: "
                + sideB
                + " units,"
                + " height: "
                + height
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return height * (sideA * sideB);
    }
}
