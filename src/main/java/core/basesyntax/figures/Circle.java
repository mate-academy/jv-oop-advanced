package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;

import java.util.Random;

public class Circle extends Figure {
    private final double radius;

    public Circle(ColorSupplier colorSupplier, Random random, int maxLength) {
        this(colorSupplier.getRandomColor(),
                getRandomLength(random, maxLength));
    }
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circe");
        System.out.println("Color: " + color);
        System.out.println("Area: " + roundDouble(calcArea()) + " sq. units");
        System.out.println("Radius: " + roundDouble(radius) + " units");
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
