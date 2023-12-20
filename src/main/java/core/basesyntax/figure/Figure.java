package core.basesyntax.figure;

public abstract class Figure implements FigureOption {
    private Color color = new ColorSupplier().getRandomColor();
    private FigureName figureName;

    public void setFigureName(FigureName figureName) {
        this.figureName = figureName;
    }

    public FigureName getFigureName() {
        return figureName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
