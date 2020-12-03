package core.basesyntax;

public abstract class Figure implements IFigure {

    protected double area;
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public abstract void calculateArea();

    public abstract void getInfo();
}
