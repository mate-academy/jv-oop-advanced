package core.basesyntax.figures;

public abstract class Figures implements Displayable, Drawable {

    protected double area;
    protected Color color;

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

}
