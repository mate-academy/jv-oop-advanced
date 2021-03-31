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

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + ", length: "
                + Math.round(getLength()) + ", width: " + Math.round(getWidth())
                + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.round((width * length * 100) / 100.0);
    }
}
