package core.basesyntax;

public abstract class Figure implements Drawable {

    public Color color;

    public Figure (Color color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public abstract void draw();
}
