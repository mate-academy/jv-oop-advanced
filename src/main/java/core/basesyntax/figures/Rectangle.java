package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;

import java.util.Random;

public class Rectangle extends Figure {
    private final double upperSide;
    private final double leftSide;

    public Rectangle(String color, double upperSide, double leftSide) {
        super(color);
        this.upperSide = upperSide;
        this.leftSide = leftSide;
    }
    public Rectangle(ColorSupplier colorSupplier, Random random, int maxLength) {
        this(colorSupplier.getRandomColor(),
                getRandomLength(random, maxLength),
                getRandomLength(random, maxLength));
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle");
        System.out.println("Color: " + color);
        System.out.println("Area: " + roundDouble(calcArea()) + " sq. units");
        System.out.println("Upper Side: " + roundDouble(upperSide) + " units");
        System.out.println("Left Side: " + roundDouble(leftSide) + " units");
    }

    @Override
    public double calcArea() {
        return upperSide * leftSide;
    }
}
