package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    public abstract void draw();
}
