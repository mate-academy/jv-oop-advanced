package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private Color color;
    private double area;

    public Figure() {
    }

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    abstract public String draw();
}
