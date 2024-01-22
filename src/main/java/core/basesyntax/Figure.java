package core.basesyntax;

abstract class Figure implements FigureInterface {
    private String color;

    public abstract double getArea();

    public abstract void draw();
}
