package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private static final int NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private int side;

    Square() {
        setSquare();
    }

    private void setSquare() {
        side = random.nextInt(NUMBER);
        setColor(colorSupplier.getRandomColor());
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, side: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(), getArea(), side, getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
