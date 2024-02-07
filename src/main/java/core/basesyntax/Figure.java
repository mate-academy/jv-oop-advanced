package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private final String name;
    private final String color;

    protected Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }
}
