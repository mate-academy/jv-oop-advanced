package core.basesyntax;

public abstract class Figure implements Drawer, AreaCalculator {
    private String colour;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

}
