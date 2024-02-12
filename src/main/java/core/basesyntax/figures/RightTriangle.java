package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle has " + color
                + "color. First leg is " + firstLeg
                + " and second leg is " + secondLeg
                + ". Area is " + getArea());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
