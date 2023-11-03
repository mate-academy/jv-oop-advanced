package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private Colors color;

    public Figure(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }
}
