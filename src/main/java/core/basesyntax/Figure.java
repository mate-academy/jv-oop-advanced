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

    protected void setArea(double area) {
        if (area < 0) {
            System.out.println("Negative number!");
            return;
        }
        this.area = area;
    }
}
