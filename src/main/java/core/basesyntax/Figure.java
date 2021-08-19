package core.basesyntax;

public abstract class Figure implements InfoDrawer, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public abstract double areaCalculator();

    @Override
    public abstract void drawFigure();
}
