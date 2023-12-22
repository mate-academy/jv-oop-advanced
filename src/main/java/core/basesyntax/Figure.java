package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected double area;
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    @Override
    public void draw() {
    }
}
