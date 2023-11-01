package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;

import java.util.Random;

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
    public RightTriangle(ColorSupplier colorSupplier, Random random, int maxLength) {
        this(colorSupplier.getRandomColor(),
                getRandomLength(random, maxLength),
                getRandomLength(random, maxLength));
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle");
        System.out.println("Color: " + color);
        System.out.println("Area: " + roundDouble(calcArea()) + " sq. units");
        System.out.println("Right leg: " + roundDouble(rightLeg) + " units");
        System.out.println("Left leg: " + roundDouble(leftLeg) + " units");
        System.out.println("Hypotenuse leg: " + roundDouble(hypotenuse) + " units");
    }

    @Override
    public double calcArea() {
        return  0.5 * rightLeg * leftLeg;
    }
}
