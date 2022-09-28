package core.basesyntax;

import java.util.Objects;

public abstract class Figure implements AreaCalculable, Drawable {
    private final Color color;

    public Figure(Color color) {
        this.color = Objects.requireNonNull(color);
    }

    public Color getColor() {
        return color;
    }
}
