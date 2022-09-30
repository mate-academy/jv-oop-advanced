package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private double baseA = 0;
    private double baseB = 0;
    private double hight = 0;

    public IsoscelesTrapezoid (String colour, double baseA, double baseB, double hight) {
        super(colour);
        this.baseA = baseA;
        this.baseB = baseB;
        this.hight =hight;
    }
    @Override
    public double getArea() {
        return (baseA + baseA) / 2 * hight;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Figure: " + Figures.ISOSCELES_TRAPEZOID.name().toLowerCase() + ", area:" + getArea()
                + " sq.units, first base: " + baseA + " , second base: "
                + baseB + " , hight: " + hight +" units, color: " + getColour();
    }
}
