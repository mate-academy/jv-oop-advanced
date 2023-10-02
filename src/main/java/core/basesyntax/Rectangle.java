package core.basesyntax;

public class Rectangle extends Figure {
    private static final int SIDE_RECTANGLE = 4;
    private int height;
    private int length;

    public Rectangle(int height, int length, Color color) {
        super(color);
        this.height = height;
        this.length = length;
    }

    public Rectangle() {
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return getHeight() * getLength();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.cm., sides: " + SIDE_RECTANGLE + " units, length: "
                + getLength() + " cm., height: " + getHeight() + " cm., color: " + getColor());
    }
}
