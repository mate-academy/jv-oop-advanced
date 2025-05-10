package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private Colors color;

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
