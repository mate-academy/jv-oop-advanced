package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    public Color color;

    public Figure(Color color) {
        this.color = color;
    }
}
