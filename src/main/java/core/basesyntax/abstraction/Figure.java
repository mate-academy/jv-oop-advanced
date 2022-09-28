package core.basesyntax.abstraction;

public abstract class Figure implements Drawable, Area {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    @Override
    public abstract String toString();
}
