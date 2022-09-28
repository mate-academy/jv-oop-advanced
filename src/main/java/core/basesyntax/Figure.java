package core.basesyntax;

import java.util.Random;

abstract class Figure implements AreaCalculator {
    public static final int VALUE_LIMIT = 50;
    protected String color;
    protected double area;
    protected Random random = new Random();
    protected ColorSupplier colorSupplier = new ColorSupplier();

    abstract void draw();
}

