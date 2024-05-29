package core.basesyntax;

public abstract class FigureBase implements Figure {
    protected final String color;

    public FigureBase(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
