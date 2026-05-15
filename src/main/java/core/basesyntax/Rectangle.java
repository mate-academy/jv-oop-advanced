package core.basesyntax;

public class Rectangle extends Figure {

    private double length;
    private double width;

    public Rectangle(double length, double width, Colors color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, Length: " + length + LENGTH_UNITS
                + ", Width: " + width + LENGTH_UNITS
                + ", Area: " + getArea() + AREA_UNITS
                + ", Color: " + color.name());
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }
}
