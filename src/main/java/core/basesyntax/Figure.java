package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawer {
    private Colour colour;

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

}
