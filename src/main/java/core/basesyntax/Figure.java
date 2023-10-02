package core.basesyntax;

public abstract class Figure implements FigureValues {
    protected String color;
    protected double area;
    protected String figureType;

    public Figure(String color) {
        this.color = color;
    }
}
