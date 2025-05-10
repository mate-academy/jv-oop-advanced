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
    public double getArea() {
        double area = width * length;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, "
                + "width: " + width + " length: " + length + ", color: " + getColor());
    }
}
