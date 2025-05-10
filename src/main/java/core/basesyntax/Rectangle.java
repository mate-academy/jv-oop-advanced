package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String name, String color, int width, int length) {
        super(name, color);
        this. width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Figure : "
                + getName()
                + ", area: "
                + getArea()
                + " sq.units, wight : "
                + getWidth() + ", length : "
                + getLength() + ", color : "
                + getColor());
    }
}
