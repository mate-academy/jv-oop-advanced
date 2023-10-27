package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final double rightLeg;
    private final double leftLeg;
    private final double hypotenuse;

    public RightTriangle(String color, double rightLeg, double leftLeg) {
        super(color);
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.hypotenuse = Math.sqrt(rightLeg * rightLeg + leftLeg * leftLeg);
        calcArea();
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Right leg: " + roundDouble(rightLeg) + " units");
        System.out.println("Left leg: " + roundDouble(leftLeg) + " units");
        System.out.println("Hypotenuse leg: " + roundDouble(hypotenuse) + " units");

    }

    @Override
    public void calcArea() {
        area = 0.5 * rightLeg * leftLeg;
    }
}
