package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq. units, "
                + "length: " + getLength() + " units, "
                + "width: " + getWidth()
                + "color: " + getColor());
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
