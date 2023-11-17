package core.basesyntax;

public abstract class Figure implements Drawable, Measurable {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }
}
