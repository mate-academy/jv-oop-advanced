package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculatable {
    private Color color;

    public Figure(String name, Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
