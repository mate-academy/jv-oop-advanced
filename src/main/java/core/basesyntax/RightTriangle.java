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
        return (rightLeg * leftLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", "
                + "area: " + this.getArea() + " sq.units, "
                + "rightLeg: " + this.rightLeg + " units, "
                + "leftLeg: " + this.leftLeg + " units, "
                + "color: " + this.color);
    }
}
