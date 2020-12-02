package core.basesyntax;

public abstract class Figure implements Draw, Area {
    protected double perimeter;
    private Colour colour;

    public Figure(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
