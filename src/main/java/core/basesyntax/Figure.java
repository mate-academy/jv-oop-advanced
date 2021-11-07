package core.basesyntax;

public abstract class Figure implements CanBeDrawn, AreaCalculator{
    protected String color;
    protected String figureType;

    public Figure(String color) {
        this.color = color;
    }
}
