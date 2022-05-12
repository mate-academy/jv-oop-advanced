package core.basesyntax;

public abstract class Figure {
    private String color;
    private String name;

    abstract double area();

    abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Figure(String color) {
        this.color = color;
    }
}
