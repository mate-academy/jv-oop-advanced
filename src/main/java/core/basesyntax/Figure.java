package core.basesyntax;

public abstract class Figure implements CalculateArea, Drawable {

    private Color color;

    public Figure(Color color) {
        setColor(color);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}

