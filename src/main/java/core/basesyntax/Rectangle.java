package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int height;

    public Rectangle(int length, int height, String color) {
        this.setLength(length);
        this.setHeight(height);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + Rectangle.class.getSimpleName().toLowerCase() + ", area: "
                + getArea() + " sq.units, length: " + getLength() + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
