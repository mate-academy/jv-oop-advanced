package core.basesyntax;

public abstract class Figure implements GetArea, Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
