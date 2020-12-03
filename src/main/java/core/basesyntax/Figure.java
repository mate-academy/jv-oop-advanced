package core.basesyntax;

public abstract class Figure implements Figuring, Drawable {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
