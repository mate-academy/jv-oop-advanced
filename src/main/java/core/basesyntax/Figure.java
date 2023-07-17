package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private final String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
