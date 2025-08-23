package core.basesyntax;

public abstract class Figure implements Drawable {
    String name;
    String color;

    public Figure(String color) {
        this.color = color;
        this.name = this.getClass().getSimpleName();
    }

    public abstract double calculateArea();
    public abstract void draw();
}
