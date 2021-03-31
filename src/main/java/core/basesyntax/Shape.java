package core.basesyntax;

public abstract class Shape implements AreaCalculator, DrawFigure {
    protected String name;
    protected String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
