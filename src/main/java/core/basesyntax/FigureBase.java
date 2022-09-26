package core.basesyntax;

public abstract class FigureBase implements IFigure, Drawable {
    private final String color;

    public FigureBase(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
