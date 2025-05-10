package core.basesyntax;

public class RightTriangle extends Figure {
    private int leftLeg;
    private int rightLeg;

    public RightTriangle(String color, int leftLeg, int b) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    @Override
    public double getArea() {
        return (leftLeg * rightLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + " sq.units, firstLeg: "
                + leftLeg + " units, secondLeg: " + rightLeg + " units, color: " + color);
    }
}
