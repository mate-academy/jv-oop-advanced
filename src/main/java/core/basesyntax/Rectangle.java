package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private static final int NUMBER = 10;
    private final Random RANDOM = new Random();
    private final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private int firstSide;
    private int secondSide;

    Rectangle() {
        setRectangle();
    }

    private void setRectangle() {
        firstSide = RANDOM.nextInt(NUMBER);
        secondSide = RANDOM.nextInt(NUMBER);
        setColor(COLOR_SUPPLIER.getRandomColor());
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
