package core.basesyntax;

public abstract class Figure implements Draw {
    private Colour colour;

    public Figure(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }
}

