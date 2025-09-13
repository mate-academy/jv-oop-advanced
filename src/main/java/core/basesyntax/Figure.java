package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public abstract class Figure implements Drawable, AreaCalculable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
