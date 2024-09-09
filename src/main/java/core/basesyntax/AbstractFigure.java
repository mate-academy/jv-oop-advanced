package core.basesyntax;

public abstract class AbstractFigure implements AreaCalculable, Drawable {
    protected String color;

    public AbstractFigure(String color) {
        this.color = color;
    }
}
