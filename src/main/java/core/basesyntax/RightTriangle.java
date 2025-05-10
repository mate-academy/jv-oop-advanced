package core.basesyntax;

public class RightTriangle extends Figure {
    private final int leftLeg;
    private final int rightLeg;

    public RightTriangle(String color, int leftLeg, int rightLeg) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    @Override
    public double obtainTheArea() {
        return (double) (leftLeg * rightLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + obtainTheArea()
                + " sq. units, leftLeg: " + leftLeg + " units, rightLeg: "
                + rightLeg + " units, color: " + getColor().toLowerCase());
    }
}
