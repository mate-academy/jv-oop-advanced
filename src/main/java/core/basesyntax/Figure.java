package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private final String Color;

    public Figure(String color) {
        Color = color;
    }
}
