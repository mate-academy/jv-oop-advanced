package core.basesyntax;

public abstract class AbstractFigure implements Drawable, Shape {
    private final String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
