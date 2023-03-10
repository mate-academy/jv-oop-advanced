package core.basesyntax;

public abstract class Figure implements Drawable,AreaCalculator{
    private String color;
    private double area;
    private String name;

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
