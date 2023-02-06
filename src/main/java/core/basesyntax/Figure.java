package core.basesyntax;

import java.util.Random;

public class Figure implements Drawable, AreaCalculator {
    static final int SITE_MAX_LENGTH = 100;
    protected static final double SIDE = new Random().nextInt(SITE_MAX_LENGTH);
    protected Color color = new ColorSupplier().getRandomColor();

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void draw() {
    }
}
