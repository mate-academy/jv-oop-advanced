package core.basesyntax;

public abstract class Figure implements Drawable, Calculable {
    private String color;
    private String name;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void draw();

    public abstract double getArea();
}
