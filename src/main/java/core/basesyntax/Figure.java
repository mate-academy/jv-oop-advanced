package core.basesyntax;

public abstract class Figure implements Drawable, AreaObtainable {
    private String name;
    private Colors color;
    private double area;

    public Figure(Colors color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Colors getColor() {
        return color;
    }

    public String getName() {
        return name = this.getClass().getSimpleName();
    }
}
