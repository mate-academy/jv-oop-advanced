package core.basesyntax;

public abstract class Figure implements Drawable {
    private String color;

    public abstract int getArea();

    public abstract void draw();
}
