package core.basesyntax;

public class Figures {
    private String color;
    private double area;

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void draw() {
        System.out.println("");
    }
}
