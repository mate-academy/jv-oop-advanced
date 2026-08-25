package core.basesyntax.figure;

public abstract class Figure implements Shape, Drawable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
