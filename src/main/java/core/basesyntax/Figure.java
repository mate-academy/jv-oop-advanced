package core.basesyntax;

public abstract class Figure implements CalculableArea, Drawable {
    private final String color;

    public Figure(Color color) {
        this.color = color.name();
    }

    public String getColor() {
        return color;
    }
}
