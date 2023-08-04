package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private final ColorType color;

    public Figure(ColorType color) {
        this.color = color;
    }

    public ColorType getColor() {
        return color;
    }
}

