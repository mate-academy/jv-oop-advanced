package core.basesyntax.figures;

public abstract class Figure implements Drawable {

    private String colour;

    public Figure(String colour) {
        this.colour = colour;
    }

    public abstract String toString();

    @Override
    public abstract void draw();

    public String getColour() {
        return colour;
    }
}
