package core.basesyntax;

public abstract class Shape implements FigureBehavior {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    @Override
    public abstract double calculateArea();

    @Override
    public abstract void draw();
}
