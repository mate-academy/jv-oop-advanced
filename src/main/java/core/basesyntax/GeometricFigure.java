package core.basesyntax;

public abstract class GeometricFigure implements Drawable, AreaCalculator {
    protected String color;

    public GeometricFigure(String colour) {
        this.color = colour;
    }

    public String getColour() {
        return color;
    }

    public void setColour() {
        this.color = color;
    }
}
