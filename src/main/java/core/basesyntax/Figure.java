package core.basesyntax;

public abstract class Figure implements Drawable, Calculatble {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
