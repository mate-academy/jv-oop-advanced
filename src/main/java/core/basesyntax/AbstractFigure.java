package core.basesyntax;

public abstract class AbstractFigure implements Drawable, Calculable {
    protected String color;

    public AbstractFigure(String color) {
        this.color = color;
    }
}
