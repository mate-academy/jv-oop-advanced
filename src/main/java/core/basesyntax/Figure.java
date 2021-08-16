package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private String colour;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public abstract void draw();
}
