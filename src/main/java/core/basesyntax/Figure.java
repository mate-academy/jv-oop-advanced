package core.basesyntax;

public abstract class Figure implements FigurePrinter, AreaCalculator {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
