package core.basesyntax;

public abstract class Figure implements FigureArea, DescriptionFigure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract void draw();
}
