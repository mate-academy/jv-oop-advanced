package core.basesyntax;

public abstract class Figure implements AreaCalculable, Drawable {
    protected final String color;

    public Figure(String color) {
        this.color = color;
    }
}
