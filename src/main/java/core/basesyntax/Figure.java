package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private final Color color;

    public Figure(String color) {
        this.color = Color.valueOf(color);
    }

    public Color getColor() {
        return color;
    }
}
