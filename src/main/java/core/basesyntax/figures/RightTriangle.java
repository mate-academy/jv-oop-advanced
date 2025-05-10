package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle: color - " + getColor().name()
                           + ", area - " + getArea()
                           + ", firstLeg - " + firstLeg
                           + ", secondLeg - " + secondLeg
                           + '.');
    }
}
