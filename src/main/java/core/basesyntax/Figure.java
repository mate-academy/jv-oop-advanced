package core.basesyntax;

import java.util.Random;

public abstract class Figure {
    private static final int MAX_NUMBER = 10;
    private Random random = new Random();

    public String getColor() {
        ColorSupplier color = new ColorSupplier();
        return color.getRandomColor();
    }

    public int getNumber() {
        return random.nextInt(MAX_NUMBER);
    }

    public abstract double getArea();

    public abstract String toString();
}
