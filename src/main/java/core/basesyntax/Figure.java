package core.basesyntax;

public class Figure {
    private String color;
    private double area;
    private String name;

    public Figure() {

    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double setArea(double area) {
        this.area = area;
        return area;
    }
    public double calcArea() {
        return 0;
    }
}
