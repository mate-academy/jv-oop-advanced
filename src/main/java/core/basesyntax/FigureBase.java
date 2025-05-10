package core.basesyntax;

public abstract class FigureBase implements AreaCalculable, Drawable {
    protected String color;

    public FigureBase(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
