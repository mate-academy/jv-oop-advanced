package core.basesyntax;

public abstract class Figure implements Printable, Randomable {
    protected String color;
    protected String name;

    public abstract double calculateArea();

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
