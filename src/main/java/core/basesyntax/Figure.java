package core.basesyntax;

public abstract class Figure implements AreaCalculator, Painter {
    protected String name;
    protected String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
