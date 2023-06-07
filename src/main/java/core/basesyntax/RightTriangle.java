package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private static final int NUMBER = 10;
    private final Random RANDOM = new Random();
    private final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private double firstLeg;
    private double secondLeg;

    RightTriangle() {
        setRightTriangle();
    }

    private void setRightTriangle() {
        firstLeg = RANDOM.nextInt(NUMBER);
        secondLeg = RANDOM.nextInt(NUMBER);
        setColor(COLOR_SUPPLIER.getRandomColor());
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, firstLeg: %.1f units,"
                        + "secondLeg: %.1f units, color: %s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(), firstLeg, secondLeg, getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
