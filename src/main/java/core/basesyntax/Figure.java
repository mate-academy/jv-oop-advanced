package core.basesyntax;

public abstract class Figure implements Drawable {
    private Colour colour;
    private double area;

    public Figure(Colour colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour.name();
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
