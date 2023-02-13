package core.basesyntax;

public class RightTriangle extends Figure {
    private double leftLeg;
    private double rightLeg;
    private  double base;

    public RightTriangle() {
    }

    public RightTriangle(String color, double leftLeg, double rightLeg, double base) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.base = base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + Double.toString(getArea())
            + ", perimeter: " + Double.toString(getPerimeter())
            + ", left leg: " + Double.toString(leftLeg)
            + ", right leg: " + Double.toString(rightLeg)
            + ", base: " + Double.toString(base)
            + ", color: " + color
        );
    }

    @Override
    public double getArea() {
        return leftLeg * base / 2;
    }

    @Override
    public double getPerimeter() {
        return leftLeg + rightLeg + base;
    }

    public double getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(double leftLeg) {
        if (leftLeg > 0) {
            this.leftLeg = leftLeg;
        } else {
            throw new RuntimeException("Left leg may be more than 0!");
        }
    }

    public double getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(double rightLeg) {
        if (rightLeg > 0) {
            this.rightLeg = rightLeg;
        } else {
            throw new RuntimeException("Right leg may be more than 0!");
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            throw new RuntimeException("Base may be more than 0!");
        }
    }
}
