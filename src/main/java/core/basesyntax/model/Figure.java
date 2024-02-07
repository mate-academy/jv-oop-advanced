package core.basesyntax.model;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.name().toLowerCase();
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
