package core.basesyntax;

public abstract class Figure {
    private String name;
    private String color;

    public Figure() {

    }

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    abstract void draw();
}
