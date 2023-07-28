package core.basesyntax.figure;

import core.basesyntax.service.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int smallerBase;
    private int biggerBase;

    public IsoscelesTrapezoid(String color, int smallerBase, int biggerBase) {
        super(color);
        this.biggerBase = biggerBase;
        this.smallerBase = smallerBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                        + " sq.units, bottom base: " + biggerBase
                        + " units, up base: " + smallerBase
                        + " units,"
                        + " color: " + getColor());
    }

    @Override
    public double getArea() {
        if (biggerBase < smallerBase) {
            return (smallerBase - biggerBase) / 2;
        } else {
            return (biggerBase - smallerBase) / 2;
        }
    }
}
