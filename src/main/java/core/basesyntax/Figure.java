package core.basesyntax;

public abstract class Figure implements Drawable, AreaCounter {
    private final String colour;

    public Figure(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
