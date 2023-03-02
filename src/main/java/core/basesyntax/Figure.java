package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
