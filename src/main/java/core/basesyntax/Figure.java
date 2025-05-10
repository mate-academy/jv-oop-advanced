package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String name;
    private String color;

    public Figure(String name, String color) {
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
