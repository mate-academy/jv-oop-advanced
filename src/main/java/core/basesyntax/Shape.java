package core.basesyntax;

public abstract class Shape {
    public Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract double figureArea();

    abstract void drawFigure();
}
