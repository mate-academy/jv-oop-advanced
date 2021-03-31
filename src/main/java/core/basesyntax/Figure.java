package core.basesyntax;

public abstract class Figure implements Calculate, Draw {
    public abstract double calculateArea();

    public abstract void setColor(String color);

    public abstract void drawFigure();
}
