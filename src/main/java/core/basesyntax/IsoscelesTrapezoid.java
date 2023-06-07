package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private static final int NUMBER = 10;
    private final Random RANDOM = new Random();
    private final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    private double firstSide;
    private double secondSide;
    private int height;

    IsoscelesTrapezoid() {
        setIsoscelesTrapezoid();
    }

    private void setIsoscelesTrapezoid() {
        firstSide = RANDOM.nextInt(NUMBER);
        secondSide = RANDOM.nextInt(NUMBER);
        height = RANDOM.nextInt(NUMBER);
        setColor(COLOR_SUPPLIER.getRandomColor());
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, firstSide: %.1f units,"
                        + "secondSide: %.1f units, height: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(), firstSide, secondSide, height, getColor());
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }
}
