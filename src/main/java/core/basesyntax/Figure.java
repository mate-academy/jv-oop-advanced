package core.basesyntax;

public abstract class Figure implements Drawable, TwoDimensional {
    private String color;
    private double area;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}
