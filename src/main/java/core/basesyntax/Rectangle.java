package core.basesyntax;

public class Rectangle extends Figure {
    private final int width;
    private final int length;

    public Rectangle(String color, String name, int width, int length) {
        super(color, name);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "," + " area:"
                + getArea() + " sq. units, width length: "
                + width + " units, length length:  "
                + length + " units, color: " + getColor());
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "width=" + width
                + ", length=" + length
                + '}';
    }
}
