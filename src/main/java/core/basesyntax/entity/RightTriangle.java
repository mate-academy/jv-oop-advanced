package core.basesyntax.entity;

import java.awt.*;

public class RightTriangle extends Figure {
    private double leftLeg;
    private double rightLeg;

    public RightTriangle(Color color, double leftLeg, double rightLeg) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    public double getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(double leftLeg) {
        this.leftLeg = leftLeg;
    }

    public double getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(double rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public void printSquare() {

    }
}
