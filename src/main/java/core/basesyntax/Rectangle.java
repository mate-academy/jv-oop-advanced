package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println("Figure : rectangle" + " Area : " + getArea()
                + " Width : " + getWidth()
                + " Length : " + getLength()
                + " Color : " + getColor());
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Figure : rectangle" + " Area : " + getArea()
                + " Width : " + getWidth()
                + " Length : " + getLength()
                + " Color : " + getColor();
    }
}
