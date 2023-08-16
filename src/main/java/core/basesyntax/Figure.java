package core.basesyntax;

public abstract class Figure implements AreaCalculator, DrawFigure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
