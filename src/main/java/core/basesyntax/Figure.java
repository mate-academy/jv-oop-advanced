package core.basesyntax;

public abstract class Figure implements Drawable, Shape {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "color: " + color;
    }

    public abstract void draw();

    @Override
    public abstract double getArea();
}
