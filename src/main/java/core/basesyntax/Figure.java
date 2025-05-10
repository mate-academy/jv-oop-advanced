package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    protected String getColor() {
        return color;
    }
}
