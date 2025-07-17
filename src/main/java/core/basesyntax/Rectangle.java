package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle information: " + "\n"
                + "Color: " + getColor() + ", "
                + "Length: " + length + ", "
                + "Width:" + width + ", "
                + "Area of rectangle: " + getArea() + "\n");
    }
}
