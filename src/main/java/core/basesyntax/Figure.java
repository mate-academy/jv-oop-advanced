package core.basesyntax;

public abstract class Figure implements Drawable {
    private final String name;
    private final String color;
    private final String uniqueProperty;

    public Figure(String name, String color, String uniqueProperty) {
        this.name = name;
        this.color = color;
        this.uniqueProperty = uniqueProperty;
    }

    public abstract double calculateArea();

    public String getUniqueProperty() {
        return uniqueProperty;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
