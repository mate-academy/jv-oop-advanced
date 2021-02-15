package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.floor(width * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, " + "area: " + getArea() + ", width: " + width
                + ", height:" + height + ", color: " + getColor());
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "width=" + width
                + ", height=" + height
                + '}';
    }
}
