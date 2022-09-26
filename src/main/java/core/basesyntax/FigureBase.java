package core.basesyntax;

public abstract class FigureBase implements Drawable {
    private final String color;

    public FigureBase(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }
}
