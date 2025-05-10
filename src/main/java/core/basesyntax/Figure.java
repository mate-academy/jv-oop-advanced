package core.basesyntax;

public abstract class Figure implements Drawable, CalculateArea {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
