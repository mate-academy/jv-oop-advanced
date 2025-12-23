package core.basesyntax;

public abstract class Figure implements AreaCalculable, Drawable {
    private final String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
