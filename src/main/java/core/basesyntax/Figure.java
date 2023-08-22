package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract double calculateArea();

    public String getColor() {
        return color;
    }
}
