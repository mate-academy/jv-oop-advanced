package core.basesyntax;

abstract class Figure implements FigureArea, FigureDrawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
