package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private final String color;
    private final FigureType type;

    public Figure(String color, FigureType type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getTypeName() {
        return type.name().toLowerCase();
    }
}
