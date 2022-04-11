package core.basesyntax;

public class RightTriangle extends Figure {
    private double rightLeg;
    private double leftLeg;

    public RightTriangle(Color color, double rightLeg, double leftLeg) {
        super(color);
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
    }

    public double getRightLeg() {
        return rightLeg;
    }

    public double getLeftLeg() {
        return leftLeg;
    }

    @Override
    public double calculateArea() {
        return (this.rightLeg * this.leftLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + this.calculateArea()
                + " sq.units, right leg: "
                + this.getRightLeg()
                + " units, left leg: "
                + this.getLeftLeg()
                + " units, color: "
                + this.getColor()
                + "\n");
    }
}
