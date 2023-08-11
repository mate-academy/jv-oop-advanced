package core.basesyntax;

public abstract class Figure implements Drawable, Countable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
