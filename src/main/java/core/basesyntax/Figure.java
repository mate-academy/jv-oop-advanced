package core.basesyntax;

public abstract class Figure implements Drawer {
    private final String color;
    private double area;

    public Figure(String color) {
        this.color = color;
    }



    public abstract void obtainTheArea();

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
