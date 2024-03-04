package core.basesyntax;

public abstract class Shape implements Drawable, AreaCalculable {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
}
