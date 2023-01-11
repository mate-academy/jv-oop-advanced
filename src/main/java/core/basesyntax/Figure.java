package core.basesyntax;

public abstract class Figure implements FigureArea, PrintFigure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
