package core.basesyntax;

public abstract class Figure implements GetArea, Drawable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
