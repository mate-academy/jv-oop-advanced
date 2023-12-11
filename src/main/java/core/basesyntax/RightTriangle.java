package core.basesyntax;

public class RightTriangle extends Figure {
    private double leftLeg;
    private double rightLeg;

    public RightTriangle(String color, double leftLeg, double rightLeg) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return leftLeg * rightLeg / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Right triangle:    area = %.2f sq. units, left leg = %.2f units, "
                        + "right leg = %.2f units, color = %s%n",
                this.area, this.leftLeg, this.rightLeg, this.color);
    }
}
