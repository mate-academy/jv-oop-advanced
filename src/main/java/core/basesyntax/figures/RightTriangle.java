package core.basesyntax.figures;

import core.basesyntax.EnumFigure;
import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int rightLeg;

    public RightTriangle(String color, int firstLeg, int rightLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.rightLeg = rightLeg;
    }

    @Override
    public double getArea() {
        return (double)(firstLeg * rightLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + EnumFigure.RIGHT_TRIANGLE.toString().toLowerCase()
                + ", area: " + getArea() + " units,"
                + " side1: " + firstLeg + " units,"
                + " side2: " + rightLeg + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
