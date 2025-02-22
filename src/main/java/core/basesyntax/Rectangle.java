package core.basesyntax;

public class Rectangle extends Figure implements Drawable {

    private double length;
    private double width;

    public Rectangle(String name, String color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getName() + ", area: " + area() + "sq. units, "
                           + "length: " + length + " units, width: " + width
                           + " units, color: " + super.getColor());
    }
}
