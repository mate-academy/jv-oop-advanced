package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private final String color;
    private final String name;

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
