package core.basesyntax;

public abstract class Figure implements AreaCalculable, Drawable {
    static final int ARRAYS_LENGTH = 6;
    static final int MAX_VALUE = 100;

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
