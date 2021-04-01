package core.basesyntax;

public abstract class Figure extends ColorSupplier implements AreaCalculator, Drawer {
    private double area;
    private Color color;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
