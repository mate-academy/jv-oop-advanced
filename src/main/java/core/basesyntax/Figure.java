package core.basesyntax;

public class Figure implements Area {
    private String name;
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Figure() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
    }

    @Override
    public String toString() {
        return "figure = " + getName() + getColor();
    }
}
