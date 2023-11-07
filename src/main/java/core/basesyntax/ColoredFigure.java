package core.basesyntax;

public abstract class ColoredFigure implements Figure {
    private final String color;

    public ColoredFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
