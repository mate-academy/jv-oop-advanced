package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    String color;

    String getColor() {
        return color;
    }
}
