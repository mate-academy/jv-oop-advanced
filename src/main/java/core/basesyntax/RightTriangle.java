package core.basesyntax;

public class RightTriangle extends Figure {
    public static final double MAX_LEG = 50;
    public static final double MAX_BASE = 100;
    private double leftLeg;
    private double rightLeg;
    private double base;

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
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + ", left leg: " + leftLeg
                + ", right leg: " + rightLeg
                + ", base: " + base
                + ", color: " + color);
    }

    @Override
    public double calculateArea() {
        return leftLeg * base / 2;
    }

    public double getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(double leftLeg) {
        if (leftLeg > 0 && leftLeg < MAX_LEG) {
            this.leftLeg = leftLeg;
        } else {
            throw new RuntimeException("Left leg may be more than 0!");
        }
    }

    public double getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(double rightLeg) {
        if (rightLeg > 0 && rightLeg < MAX_LEG) {
            this.rightLeg = rightLeg;
        } else {
            throw new RuntimeException("Right leg may be more than 0!");
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0 && base < MAX_BASE) {
            this.base = base;
        } else {
            throw new RuntimeException("Base may be more than 0!");
        }
    }
}
