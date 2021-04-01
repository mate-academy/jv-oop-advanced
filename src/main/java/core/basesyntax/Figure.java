package core.basesyntax;

public abstract class Figure {
    double area;
    Color color;

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
    public abstract void draw();
}
