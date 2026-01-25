package core.basesyntax.figures;

import core.basesyntax.enums.FigureType;

public class Rectangle extends Figure {
    private final int rightLegLength;
    private final int leftLegLength;
    private final int upperBase;
    private final int downBase;

    public Rectangle(int rightLegLength, int leftLegLength, int upperBase, int downBase) {
        this.rightLegLength = rightLegLength;
        this.leftLegLength = leftLegLength;
        this.upperBase = upperBase;
        this.downBase = downBase;
    }

    @Override
    public double getArea() {
        return (double) leftLegLength * upperBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.RECTANGLE + ", area: "
                + this.getArea()
                + " sq. units, rightLegLength: "
                + rightLegLength
                + " units, leftLegLength: "
                + leftLegLength
                + " units, upperBase: "
                + upperBase
                + " units, downBase: "
                + downBase
                + " units, color: "
                + super.getColor());
    }
}
