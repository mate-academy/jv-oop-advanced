package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();
}
