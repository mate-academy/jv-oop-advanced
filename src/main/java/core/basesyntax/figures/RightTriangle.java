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
    }

    @Override
    public void draw() {
        String output = "Figure: right triangle" + System.lineSeparator()
                + "Color: " + color + System.lineSeparator()
                + "Area: " + roundDouble(calcArea()) + " sq. units" + System.lineSeparator()
                + "Right leg: " + roundDouble(rightLeg) + " units" + System.lineSeparator()
                + "Left leg: " + roundDouble(leftLeg) + " units" + System.lineSeparator()
                + "Hypotenuse leg: " + roundDouble(hypotenuse) + " units";

        System.out.println(output);
    }

    @Override
    public double calcArea() {
        return 0.5 * rightLeg * leftLeg;
    }
}
