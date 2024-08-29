package core.basesyntax;

import java.util.Random;

abstract class Figure implements AreaCalculator, Drawable {
    private static final double MAX_SIZE = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    protected String color;
    private final Random random = new Random();

    public Figure(String color) {
        this.color = color;
    }
}
