package core.basesyntax;

public abstract class Figure implements FigurePrinter, AreaCalculator {
    private String color;
    private double area;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
