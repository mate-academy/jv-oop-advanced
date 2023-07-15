package core.basesyntax;

abstract class Figure implements Drawable, Calculable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract void draw();
}
