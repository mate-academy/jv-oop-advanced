package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;

import java.util.Random;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }
    public Square(ColorSupplier colorSupplier, Random random, int maxLength) {
        this(colorSupplier.getRandomColor(),
                getRandomLength(random, maxLength));
    }

    @Override
    public void draw() {
        System.out.println("Figure: square");
        System.out.println("Color: " + color);
        System.out.println("Area: " + roundDouble(calcArea()) + " sq. units");
        System.out.println("Side: " + roundDouble(side) + " units");
    }

    @Override
    public double calcArea() {
        return side * side;
    }
}
