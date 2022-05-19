package core.basesyntax;

public abstract class Figure implements Area, Drawable {
    private final String colour;

    protected Figure(String colour) {
        this.colour = colour;
    }

    protected double roundValues(double value) {
        return (double)Math.round(value * 1000d) / 1000d;
    }

    public String getColour() {
        return colour;
    }

}
