package core.basesyntax;

public abstract class Figure implements Drawable {
    private String name;
    private String color;

    abstract double getArea();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
