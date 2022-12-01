package core.basesyntax;

public abstract class Figure {
    public String name;
    public String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Figure() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
