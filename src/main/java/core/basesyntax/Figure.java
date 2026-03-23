package core.basesyntax;

import java.util.Objects;

public abstract class Figure implements AreaCalculable,Drawable {
    protected final String color;

    Figure(String color) {
        this.color = Objects.requireNonNull(color);
        if (color.isBlank()) {
            throw new IllegalArgumentException("Color must be not empty");
        }
    }

    protected String format(double value) {
        return String.format("%.2f", value);
    }
}
