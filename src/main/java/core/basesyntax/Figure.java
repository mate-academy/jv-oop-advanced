package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;
    private float area;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
