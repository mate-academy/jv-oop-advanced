package core.basesyntax.model;

public abstract class Figure implements AreaCalculator {
    protected String name;
    protected Color color;

    public Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: " + name + " color: " + color;
    }
}
