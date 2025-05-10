package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super.setColor(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public static Rectangle createRectangle(double length, double width, String color) {
        return new Rectangle(length, width, color);
    }

    @Override
    public void draw() {
        double area = length * width;
        System.out.println("Figure: rectangle, area: " + decimalFormat.format(area)
                + " sq.units, length: "
                + decimalFormat.format(length) + " units, width: "
                + decimalFormat.format(width) + " units, color: " + getColor());
    }
}
