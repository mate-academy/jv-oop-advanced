package core.basesyntax;

public abstract class Figure implements AreaCalculatable, Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
