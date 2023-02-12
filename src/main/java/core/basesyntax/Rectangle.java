package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle"
                + ", area: " + getArea() + " sq.units"
                + ", width: " + width
                + ", length: " + length
                + ", color: " + getColor());
    }
}
