package core.basesyntax;

public abstract class Figure implements Drawable {
    private double area;
    private Enum color;

    public Enum getColor() {
        return color;
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return this.area;
    }

}
