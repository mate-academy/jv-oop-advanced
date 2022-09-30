package core.basesyntax.figures;

public abstract class Figure implements Drawable {
    private String colour;

    public abstract String toString();

    public Figure(String colour) {
        this.colour = colour;
    }

    @Override
    public abstract void draw();

    public String getColour() {
        return colour;
    }
}
