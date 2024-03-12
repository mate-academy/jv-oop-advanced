package core.basesyntax;

public abstract class Figure implements AreaCalculator, DrawFigure {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Figure() {
    }
}
