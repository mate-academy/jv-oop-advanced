package core.basesyntax;

public abstract class Figure implements Area, Drawable {
    protected String color;

    public String getColor() {
        return color;
    }
}
