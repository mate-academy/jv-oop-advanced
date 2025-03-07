package core.basesyntax;

public abstract class Figure implements Draw {
    private Color color;

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
