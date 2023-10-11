package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    String color;

    public Figure(String color) {
        this.color = color;
    }
}
