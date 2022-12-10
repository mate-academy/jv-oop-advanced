package core.basesyntax;

public abstract class Figure implements FigureArea {
    protected String color;

    public abstract double calculateArea();

    public abstract String drawTheFigure();
}
