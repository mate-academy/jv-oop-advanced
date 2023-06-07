package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private static final int NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private int firstSide;
    private int secondSide;

    Rectangle() {
        setRectangle();
    }

    private void setRectangle() {
        firstSide = random.nextInt(NUMBER);
        secondSide = random.nextInt(NUMBER);
        setColor(colorSupplier.getRandomColor());
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units,"
                        + "firstSide: %d units, secondSide: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(), firstSide, secondSide, getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
