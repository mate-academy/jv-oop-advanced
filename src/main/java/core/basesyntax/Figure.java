package core.basesyntax;

public abstract class Figure implements FigureDraw, FigureGetArea {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return FigureGetArea.super.getArea();
    }

    public void draw() {
    }
}
