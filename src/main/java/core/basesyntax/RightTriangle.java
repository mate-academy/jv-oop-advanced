package core.basesyntax;

public class RightTriangle extends Figure {

    private int leftLeg;
    private int rightLeg;

    public RightTriangle(Color color, int leftLeg, int rightLeg) {
        setColor(color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    @Override
    public double calculateArea() {
        return (double) (leftLeg * rightLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("\nRightTriangle with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println("left leg:" + leftLeg + "\nright leg:" + rightLeg + "\n");
    }
}
