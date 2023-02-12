package core.basesyntax;

public abstract class Figure implements FigureArea, FigureDraw {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
