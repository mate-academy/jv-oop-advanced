package core.basesyntax;

public abstract class AbstractFigure implements Drawable, AreaCalculator {
    private String type;
    private String color;

    public AbstractFigure(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
