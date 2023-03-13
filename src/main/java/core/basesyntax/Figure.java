package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;

    public Figure(String color) {
        this.color = Color.valueOf(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Color.valueOf(color);
    }
}
