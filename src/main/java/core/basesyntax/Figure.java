package core.basesyntax;

public abstract class Figure implements Drawable {
    protected String color;
    protected double area;

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

    @Override
    public void toDraw() {
        System.out.println("Default Figure");
    }
}
