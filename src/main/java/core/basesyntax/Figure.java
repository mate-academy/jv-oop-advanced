package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String name;
    private Color color;

    public Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}
