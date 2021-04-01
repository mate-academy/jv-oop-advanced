package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawer {
    private double area;
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

}
