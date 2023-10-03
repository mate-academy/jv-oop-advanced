package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Rectangle, " + "area: " + getArea() + ","
                + " length: " + length + "," + " width: " + width + ","
                + " color: " + super.getColor());
    }
}
