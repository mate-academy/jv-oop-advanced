package core.basesyntax.figures;

public abstract class Figure implements FigureData {
    protected String color;
    protected double area;

    public Figure(String color) {
        this.color = color.toLowerCase();

    }
}
