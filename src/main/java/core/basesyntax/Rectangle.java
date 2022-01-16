package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(int width, int length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        double area = width * length;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area() + " sq.units, "
                + "width: " + width + " length: " + length + ", color: " + getColor());
    }
}
