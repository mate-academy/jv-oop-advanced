package core.basesyntax.figure;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double area = width * length;
        double scale = Math.pow(10, 3);
        return Math.ceil(area * scale) / scale;
    }

    @Override
    public String draw() {
        int index = this.getClass().getName().lastIndexOf(".");
        String name = this.getClass().getName().substring(index + 1);
        String figure = "Figure: " + name + ", area: " + this.getArea() + ", sq. units, side 1: "
                + this.width + " units, side 2: " + this.length + " units, color: "
                + this.getColor();
        return figure;
    }
}
