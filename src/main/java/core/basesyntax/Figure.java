package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;

    public String getColor() {
        return color.name();
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
