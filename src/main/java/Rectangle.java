public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + String.format("%.2f", getArea())
                + ", length: " + getLength() + ", width: " + getWidth() + ", color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
