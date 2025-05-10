package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculatable {
    protected final Color color;

    protected Figure(Color color) {
        this.color = color;
    }
}
