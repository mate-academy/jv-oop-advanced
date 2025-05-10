package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
