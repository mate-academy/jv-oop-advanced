package core.basesyntax;

public abstract class Figure implements Area, Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract void draw();

}
