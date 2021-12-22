package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    //Drawable should have abstract method draw()
    // AreaCalculator should have sbstract method getArea();
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
