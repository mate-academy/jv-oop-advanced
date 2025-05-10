package core.basesyntax;

abstract class Figure implements FigureDraw {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double getArea();
}
