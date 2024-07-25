package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private final String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
