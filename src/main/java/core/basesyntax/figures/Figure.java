package core.basesyntax.figures;

public abstract class Figure implements Drawable,Area {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
