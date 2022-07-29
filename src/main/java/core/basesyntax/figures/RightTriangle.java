package core.basesyntax.figures;

import core.basesyntax.EnumFigure;
import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int rightLeg;

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(int rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public double getArea() {
        return (double)(firstLeg * rightLeg) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + EnumFigure.RIGHT_TRIANGLE.toString().toLowerCase()
                + ", area: " + getArea() + " units,"
                + " side1: " + firstLeg + " units,"
                + " side2: " + rightLeg + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
