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
    public double calculateArea() {
        return (base * rightLeg) / 2;
    }

    @Override
    public void draw() {
        String firstPart = "Figure: right triangle, area: " + calculateArea() + " sq. units, ";
        String secondPart = "right leg: " + rightLeg + " units, color: " + getColor();
        System.out.println(firstPart + secondPart);
    }
}
