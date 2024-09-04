package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable{
    public final String color;

    Figure(String color) {
        this.color = color;
    }
}
