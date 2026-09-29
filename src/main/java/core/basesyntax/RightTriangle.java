package core.basesyntax;

public class RightTriangle extends Figure {

    private int rightLeg;
    private int leftLeg;

    public RightTriangle(String color, int rightLeg, int leftLeg) {
        super(color);
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
    }

    public void setRightLeg(int rightLeg) {
        this.rightLeg = rightLeg;
    }

    public int getRightLeg() {
        return this.rightLeg;
    }

    public void setLeftLeg(int leftLeg) {
        this.leftLeg = leftLeg;
    }

    public int getLeftLeg() {
        return this.leftLeg;
    }

    @Override
    public double getArea() {
        return this.rightLeg * this.leftLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("right triangle, area: " + this.getArea()
                + " sq. units, right leg: " + this.rightLeg + ", left leg: "
                + this.leftLeg + " , color: " + this.getColor());
    }
}
