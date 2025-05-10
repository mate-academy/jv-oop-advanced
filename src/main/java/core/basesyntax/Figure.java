package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color color;
    private String name;

    public Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
