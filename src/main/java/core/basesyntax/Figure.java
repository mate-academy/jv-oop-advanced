package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private String name;

    public Figure(String name, String color) {
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
