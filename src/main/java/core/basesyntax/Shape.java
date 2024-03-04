package core.basesyntax;

public abstract class Shape implements Calculable, Drawable {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
}
