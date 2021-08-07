package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, length: " + getLength()
                + " units, width: " + getWidth()
                + " units, color: " + getColor());
    }

    @Override
    public String getArea() {
        return String.format("%.1f", (double) getLength() * getWidth());
    }
}
