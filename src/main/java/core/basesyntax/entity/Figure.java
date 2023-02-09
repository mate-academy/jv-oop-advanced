package core.basesyntax.entity;

public abstract class Figure {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
