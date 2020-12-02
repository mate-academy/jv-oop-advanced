package core.basesyntax;

public abstract class Figure implements Workable {
    private Color color;
    private double area;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
