package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    public static final int amountOfFigures = 5;
    public static final int defaultRadius = 10;
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
