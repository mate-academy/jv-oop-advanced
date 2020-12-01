package core.basesyntax.figures;

public abstract class Figures {

    protected double area;
    protected Color color;

    public abstract void displayInfo();

    public abstract void draw();

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

}
