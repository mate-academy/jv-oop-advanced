package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width, Color color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public void draw() {
        System.out.println("Figure: rectangle, " + "area: "
                + getArea() + " sq. units, length: "
                + length + " units, width: " + width + " units, color: " + color);
    }
}
