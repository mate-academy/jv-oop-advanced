package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(int width, int length, Color color) {
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

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.getArea()
                + " sq. units, width: " + this.width
                + " units, length: " + this.length
                + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
