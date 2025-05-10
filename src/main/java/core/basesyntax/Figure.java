package core.basesyntax;

public abstract class Figure implements Drawable, FigureArea {
    private DiffColor color;

    public Figure(DiffColor color) {
        this.color = color;
    }

    public DiffColor getColor() {
        return color;
    }
}
