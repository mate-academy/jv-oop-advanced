package core.basesyntax;

public abstract class Figure {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void draw();
}
