package core.basesyntax;

public abstract class Figure implements FigurePrinter, AreaCalculator {
    private String color;
    private double area;

    public String getColor() {
        return color;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
