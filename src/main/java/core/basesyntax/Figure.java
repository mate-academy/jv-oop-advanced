package core.basesyntax;

import java.util.Random;

public abstract class Figure implements AreaCalculator, Drawable {
    private static final double MAX_SIZE = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private String color;
    private final Random random = new Random();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
