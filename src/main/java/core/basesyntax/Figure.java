package core.basesyntax;

public abstract class Figure implements FigureArea {
    public String color;
    public double area;
    public String name;

    public abstract double getArea();
}
