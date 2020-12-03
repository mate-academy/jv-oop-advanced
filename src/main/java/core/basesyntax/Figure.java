package core.basesyntax;

public abstract class Figure implements FigureInterface {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
