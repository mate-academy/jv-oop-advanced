package core.basesyntax;

public abstract class Figure implements Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    abstract double getArea();
}
