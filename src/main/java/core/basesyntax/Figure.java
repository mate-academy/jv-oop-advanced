package core.basesyntax;

public abstract class Figure implements AreaFigure, Drawable {
    protected String color;
    protected String name;
    protected double area;

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }
}
