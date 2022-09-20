package core.basesyntax;

public abstract class Figure implements Drawable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }
}
