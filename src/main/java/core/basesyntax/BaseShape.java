package core.basesyntax;

public abstract class BaseShape implements Drawable, Measurable {
    protected String color;

    public BaseShape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
