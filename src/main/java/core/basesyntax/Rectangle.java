package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
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

    @Override
    public double getArea() {
        return 2 * (length + width);
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: ractangle, "
                + "area: " + getArea() + " sq.units, "
                + "length: " + getLength() + " units, "
                + "width: " + getWidth() + " units, "
                + "color: " + getColor());
    }
}
