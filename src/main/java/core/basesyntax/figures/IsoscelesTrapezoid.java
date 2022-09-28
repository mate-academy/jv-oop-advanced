package core.basesyntax.figures;

import core.basesyntax.interfaces.Area;
import core.basesyntax.interfaces.Drawing;

public class IsoscelesTrapezoid extends Figure implements Area, Drawing {
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * Math.sqrt(sideC * sideC - Math.pow(sideA - sideB, 2) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, side a: " + sideA + " units, side b: " + sideB
                + " units, side c: " + sideC + " units, color: " + getColor());
    }
}
