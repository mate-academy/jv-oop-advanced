package core.basesyntax;

public abstract class FigureObject implements calculational, Drawable {
    private String color;

    public FigureObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
