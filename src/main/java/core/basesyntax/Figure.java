package core.basesyntax;

public abstract class Figure implements FigureDraw, AreaCalculator {
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
    public void draw() {
    }

    @Override
    public double getArea() {
        return 0;
    }
}
