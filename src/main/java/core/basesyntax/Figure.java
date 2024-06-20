package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }
}
