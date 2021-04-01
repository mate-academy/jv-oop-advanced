package core.basesyntax.shapes;

public abstract class Shape implements AreaCalculable, Drawable {
    private String name;
    private String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
