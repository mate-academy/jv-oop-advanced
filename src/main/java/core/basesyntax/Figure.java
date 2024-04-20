package core.basesyntax;

public abstract class Figure implements HaveArea, Drawable {
    protected Color color;
    protected double area;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
