package core.basesyntax.Figures;

import core.basesyntax.Interfaces.Draweble;

public class IsoscelesTrapezoid extends Figure {
    private final int rightLegLength;
    private final int leftLegLength;
    private final int upperBase;
    private final int downBase;
    private final double height;

    public IsoscelesTrapezoid(int rightLegLength, int leftLegLength, int upperBase, int downBase) {
        this.leftLegLength = leftLegLength;
        this.rightLegLength = rightLegLength;
        this.downBase = downBase;
        this.upperBase = upperBase;
        this.height = getHeight();
    }

    public double getHeight() {
        double diff = downBase - upperBase;
        return Math.sqrt(
                rightLegLength * rightLegLength
                        - (diff / 2.0) * (diff / 2.0)
        );
    }

    @Override
    public double getArea() {
        return (upperBase + downBase) * height / 2.0;
    }

    @Override
    public String drawing() {
        return "Figure: isosceles trapezoid, area: "
                + this.getArea()
                + " sq. units, leftLegLength: "
                + leftLegLength
                + " units, rightLegLength: "
                + rightLegLength
                + " units, downBase: "
                + downBase
                + " units, upperBase: "
                + upperBase
                + " units, height: "
                + getHeight()
                + " units, color: "
                + super.getColor();
    }
}
