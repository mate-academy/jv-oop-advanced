package core.basesyntax;

public abstract class Figure implements AreaCalculator, Draw {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
