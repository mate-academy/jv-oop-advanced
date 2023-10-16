package core.basesyntax;

public abstract class Figure implements Drowable, AreaObtain {
    private String color;
    private double area;

    public Figure(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
