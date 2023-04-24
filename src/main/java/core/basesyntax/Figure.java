package core.basesyntax;

public abstract class Figure implements Draw, AreaCalculator {
    private String color;
    private double area;

    public Figure() {
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
