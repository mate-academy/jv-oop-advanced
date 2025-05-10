package core.basesyntax;

public abstract class Figure implements FigureDrawing, AreaCalculation {
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

    @Override
    public abstract double getArea();

    @Override
    public abstract void draw();
}
