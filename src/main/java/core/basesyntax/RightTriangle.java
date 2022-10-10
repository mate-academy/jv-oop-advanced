package core.basesyntax;

public class RightTriangle extends Figure {
    private int leftLeg;
    private int rightLeg;

    public RightTriangle(int leftLeg, int rightLeg) {
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    public int getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(int leftLeg) {
        this.leftLeg = leftLeg;
    }

    public int getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(int rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public double getArea() {
        return (double) leftLeg * rightLeg / 2;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea()
                + " sq. units, left leg: " + getLeftLeg()
                + " unit(s), right leg: " + getRightLeg()
                + " unit(s), color: " + getColor());
    }
}
