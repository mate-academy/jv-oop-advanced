package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double leftLeg;
    private final double rightLeg;
    private final double height;

    public IsoscelesTrapezoid(Color color, int leftLeg, int rightLeg, int height) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (leftLeg + rightLeg) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, side a: "
                + leftLeg + " units,"
                + " side b: " + rightLeg + " units, color: " + getColor());
    }
}
