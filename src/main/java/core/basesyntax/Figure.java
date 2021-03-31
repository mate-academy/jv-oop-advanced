package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private String property;

    public Figure(String color, String property) {
        this.color = color;
        this.property = property;
    }

    public String getColor() {
        return color;
    }

    public String getProperty() {
        return property;
    }
}
