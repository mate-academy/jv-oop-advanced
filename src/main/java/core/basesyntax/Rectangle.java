package core.basesyntax;

public class Rectangle extends Figure{
    private double width;
    private double length;

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        double area =  width * length;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area() + " sq.units, " +
                "width: " + width + " length: " + length + ", color: " + getColor());
    }
}
