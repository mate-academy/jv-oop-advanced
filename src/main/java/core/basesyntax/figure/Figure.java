package core.basesyntax.figure;

public abstract class Figure implements IFigure, Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }
}
