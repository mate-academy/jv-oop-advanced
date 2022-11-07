package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int length;
    private int width;
    private int height;

    public IsoscelesTrapezoid(String color, int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.setColor(Color.valueOf(color));
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
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
                + ", area=" + calculateArea()
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
    public int calculateArea() {
        return (length + width) / 2 * height;
    }
}
