package core.basesyntax;

public abstract class Figure {
    private Color color;
    private double area;
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
