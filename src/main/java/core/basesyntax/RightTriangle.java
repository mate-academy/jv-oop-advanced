package core.basesyntax;

public class RightTriangle extends Figure {
    private int rightLeg;
    private int leftLeg;

    public RightTriangle(int rightLeg, int leftLeg, String color) {
        super(color);
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
    }

    @Override
    public double getArea() {
        return (leftLeg * rightLeg) * 0.5;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, "
                + "area: " + getArea() + " sq.units, "
                + "right leg: " + rightLeg + " units, "
                + "left leg: " + leftLeg + " units, "
                + "color: " + color
        );
    }
}
