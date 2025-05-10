package core.basesyntax;

public class RightTriangle extends Figure {
    private int leftLeg;
    private int rightLeg;

    public RightTriangle(String color, int leftLeg, int rightLeg) {
        super(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    @Override
    public double area() {
        return (leftLeg * rightLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + area()
                + " sq. units, left Leg: " + leftLeg
                + " sq. units, right Leg: " + rightLeg
                + " units, color: " + getColor());
    }
}
