package core.basesyntax;

public abstract class Figure implements PrintInfo {
    private double area;
    private Color color;

    public Figure(double area, Color color) {
        this.area = area;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }
}
