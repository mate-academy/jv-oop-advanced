package core.basesyntax;

public class Rectangle extends Figure{

    private final double width;
    private final double length;

    public Rectangle(Color color, double width, double length) {
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
        System.out.println("Figure: " + "Rectangle, "
                + "area: " + getArea() + " sq.units, "
                + "width: " + width + "units, "
                + "length: " + length + "units, "
                + "color: " + getColor());

    }
}
