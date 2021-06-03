package core.basesyntax;

public abstract class Figures implements AreaCalculator, Drawable {
    private final String name;
    private final String color;

    public Figures(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
