package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private final String name;

    public Figure(String color, String name) {
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
