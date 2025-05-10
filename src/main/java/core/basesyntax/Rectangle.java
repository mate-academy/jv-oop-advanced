package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
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
        System.out.println("Rectangle, "
                + "getArea: " + getArea() + " sq.units, "
                + "length: " + this.length + " units, "
                + "width: " + this.width + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
