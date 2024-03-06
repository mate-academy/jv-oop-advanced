package core.basesyntax;

public abstract class Figure implements GetArea, Drawable {
    private Colors color;

    public Figure(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }
}
