package core.basesyntax;

public abstract class Figure implements Drawable {
    protected final String color;

    public Figure(String color) {
        this.color = color;
    }

    private String getColor() {
        return color;
    }
}
