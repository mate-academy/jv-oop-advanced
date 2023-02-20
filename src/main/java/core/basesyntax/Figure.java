package core.basesyntax;

public abstract class Figure implements Drawable {

    private final String name;
    private final Color color;

    public Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color.getName();
    }

    abstract double getArea();
}
