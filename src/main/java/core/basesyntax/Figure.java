package core.basesyntax;

public abstract class Figure {
    private Color color;

    public abstract double area();

    public abstract String draw();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
