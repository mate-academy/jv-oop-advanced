package core.basesyntax.figures;

public abstract class Figure implements Drawable, AreaCalculator {

    private String colour;

    public Figure(String colour) {
        this.colour = colour;
    }

    public abstract String toString();

    @Override
    public abstract void draw();

    @Override
    public abstract double getArea();

    public String getColour() {
        return colour;
    }
}
