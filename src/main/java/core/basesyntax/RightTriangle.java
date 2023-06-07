package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private static final int NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private double firstLeg;
    private double secondLeg;

    RightTriangle() {
        setRightTriangle();
    }

    private void setRightTriangle() {
        firstLeg = random.nextInt(NUMBER);
        secondLeg = random.nextInt(NUMBER);
        setColor(colorSupplier.getRandomColor());
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
