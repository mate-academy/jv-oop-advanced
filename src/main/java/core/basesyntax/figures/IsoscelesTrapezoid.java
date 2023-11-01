package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private final double baseUp;
    private final double baseBottom;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseUp, double baseBottom, double height) {
        super(color);
        this.baseUp = baseUp;
        this.baseBottom = baseBottom;
        this.height = height;
    }
    public IsoscelesTrapezoid(ColorSupplier colorSupplier, Random random, int maxLength) {
        this(colorSupplier.getRandomColor(),
                getRandomLength(random, maxLength),
                getRandomLength(random, maxLength),
                getRandomLength(random, maxLength));
    }

    public double calcArea() {
        return 0.5 * (baseUp + baseBottom) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid");
        System.out.println("Color: " + color);
        System.out.println("Area: " + roundDouble(calcArea()) + " sq. units");
        System.out.println("Base (top): " + roundDouble(baseUp) + " units");
        System.out.println("Base (bottom): " + roundDouble(baseBottom) + " units");
        System.out.println("Height: " + roundDouble(height) + " units");
    }

}
