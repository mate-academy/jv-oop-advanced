package core.basesyntax;

public abstract class Figure implements Shape, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract void draw();
}
