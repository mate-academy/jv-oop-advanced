package core.basesyntax;

public class RightTriangle extends Figure {
    private int rightLeg;
    private int leftLeg;

    public RightTriangle(int rightLeg, int leftLeg, String color) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.color = color;
    }

    public int getRightLeg() {
        return rightLeg;
    }

    public int getLeftLeg() {
        return leftLeg;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return (leftLeg * rightLeg) * 0.5;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, " +
                        "area: " + area() + " sq.units, " +
                        "right leg: " + getRightLeg() + " units, " +
                        "left leg: " + getLeftLeg() + " units, " +
                        "color: " + getColor());
    }
}
