package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    Color color;

    public Figure(Color color) {
        this.color = color;
    }
}
