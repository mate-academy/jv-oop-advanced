package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int height;
    private int upperSide;

    public IsoscelesTrapezoid(Color color, int femur, int height, int upperSide) {
        super(color);
        this.base = femur;
        this.height = height;
        this.upperSide = upperSide;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid has " + getArea()
                + " color and femur length " + base
                + ". Area is " + getArea());
    }

    @Override
    public double getArea() {
        return (base + upperSide) / 2 * height;
    }
}
