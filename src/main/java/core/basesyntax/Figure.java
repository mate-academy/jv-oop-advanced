package core.basesyntax;

public abstract class Figure implements Printable, AreaCalculator, Randomable {
    protected String color;
    protected String name;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
