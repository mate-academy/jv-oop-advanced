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
        System.out.println(System.lineSeparator()
                + "Circle with area of " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + " color: " + super.getColor()
                + System.lineSeparator()
                + "left leg:" + leftLeg
                + System.lineSeparator()
                + "right leg:" + rightLeg
                + System.lineSeparator());
    }
}
