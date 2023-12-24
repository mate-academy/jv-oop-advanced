package core.basesyntax;

public abstract class Figure implements Printable, AreaCalculator {
    protected String color;
    protected String name;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
