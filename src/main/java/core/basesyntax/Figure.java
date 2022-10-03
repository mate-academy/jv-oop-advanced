package core.basesyntax;

public class Figure {
    private String color = "white";
    private double area;
    private String name;

    public Figure() {

    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Figure(String color) {
        this.color = color;
    }

    public double setArea(double area) {
        this.area = area;
        return area;
    }
}
