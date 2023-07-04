package core.basesyntax;

import java.util.Random;

public abstract class Figure implements AreaCalculator, Drawable {
    public static final int MAX_PARAMETER_SIZE = 20;

    protected Color color;
    protected Random random = new Random();
    protected ColorSupplier colorSupplier = new ColorSupplier();

    abstract void setDefaultParameters();

    abstract void setRandomParameters();
}
