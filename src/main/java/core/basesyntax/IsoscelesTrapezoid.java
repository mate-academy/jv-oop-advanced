package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int leftLeg;
    private int rightLeg;
    private int heightLeg;

    public IsoscelesTrapezoid(String color, int leftLeg, int rightLeg, int heightLeg) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.heightLeg = heightLeg;
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

    public int getHeightLeg() {
        return heightLeg;
    }

    public void setHeightLeg(int heightLeg) {
        this.heightLeg = heightLeg;
    }

    @Override
    public double getArea() {
        return (leftLeg + rightLeg) * heightLeg / 2;
    }

    @Override
    public String draw() {
        return "IsoscelesTrapezoid Color: " + getColor()
                + " - Radius: " + getArea();
    }

}
