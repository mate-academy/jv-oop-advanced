package core.basesyntax;

public abstract class Figure implements Drawable, Calculateble {
    private String color;

    public Figure(Color color) {
        this.color = color.name();
    }
}
