package core.basesyntax;

public class RightTriangle extends Figure {
    private int leftLeg;
    private int rightLeg;

    public RightTriangle(String color, int leftLeg, int rightLeg) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    public void setLeftLeg(int leftLeg) {
        this.leftLeg = leftLeg;
    }

    public void setRightLeg(int rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public double getArea() {
        return (leftLeg * rightLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: rightTriangle, area: " + getArea() + " sq.units, leftLeg: "
                + leftLeg + " units, rightLeg: " + rightLeg + " units, color: " + getColor();
    }
}
