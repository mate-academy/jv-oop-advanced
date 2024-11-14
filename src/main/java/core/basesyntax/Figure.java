package core.basesyntax;

public abstract class Figure implements AreaCalculable, Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
