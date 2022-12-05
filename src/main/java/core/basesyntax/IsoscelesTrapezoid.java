package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double length;
    private double width;
    private double height;

    public IsoscelesTrapezoid(Color color, double length, double width, double height) {
        super(color);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{"
                + "length=" + length
                + ", width=" + width
                + ", height=" + height
                + ", color=" + getColor()
                + '}';
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid"
                + ", area=" + getArea()
                + " sq.units"
                + "length=" + length
                + " units"
                + ", width=" + width
                + " units"
                + ", height=" + height
                + " units"
                + ", color=" + getColor());
    }

    @Override
    public double getArea() {
        return (length + width) / 2 * height;
    }
}
