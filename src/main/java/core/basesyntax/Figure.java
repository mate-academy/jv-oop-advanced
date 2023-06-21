package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    public Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Figure() {
    }
}

