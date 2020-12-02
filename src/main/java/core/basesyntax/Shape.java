package core.basesyntax;

public abstract class Shape implements Drawable {
    private Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }

    public abstract double calculateArea();

    public Colour getColour() {
        return colour;
    }

}
