package core.basesyntax;

public class Triangle extends Figure implements Drawable {
    private double length;
    private double width;

    public Triangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
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

    public double getHypotenuse() {
        return Math.sqrt(length * length + width * width);
    }

    @Override
    public double getArea() {
        return length * width / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + String.format("%.1f", getArea())
                + " sq. units, hypotenuse: " + String.format("%.1f", getHypotenuse())
                + " units, color: " + getColor());
    }
}
