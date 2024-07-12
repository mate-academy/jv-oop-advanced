package core.basesyntax;

public class RightTriangle extends Figure {
    private double rightLeg;
    private double base;

    public RightTriangle(double rightLeg, double base, String color) {
        super(color);
        this.rightLeg = rightLeg;
        this.base = base;
    }

    public void setRightLeg(double rightLeg) {
        this.rightLeg = rightLeg;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getRightLeg() {
        return rightLeg;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double area() {
        return (base * rightLeg)/2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle," + " area: " + area() + " sq. units," + " right leg: " + rightLeg + " units, base: " + base + " units, " + "color: " + getColor());
    }
}
