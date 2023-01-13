package core.basesyntax;

public class Figure implements Drawable, AreaCalculator {
    private Color color;
    private double area;

    public Figure(Color color) {
        this.color = color;
    }

    public void draw() {
        System.out.print(", " + "color: " + color
                + ", " + "area: " + area + " square units, ");
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return this.area;
    }
}
