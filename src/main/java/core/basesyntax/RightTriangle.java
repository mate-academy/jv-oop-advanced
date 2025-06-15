package core.basesyntax;

class RightTriangle extends Figure {
    private final double rightLeg;
    private final double leftLeg;

    public RightTriangle(String color, double rightLeg, double leftLeg) {
        super(color);
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
    }

    @Override
    public double getArea() {
        return (rightLeg * leftLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq. units, rightLeg: "
                + rightLeg + " units, leftLeg: " + leftLeg + " units, color: " + color);
    }
}
