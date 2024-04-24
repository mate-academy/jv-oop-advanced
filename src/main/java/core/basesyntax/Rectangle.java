package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return (length * width);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq. units, length: "
                + length + " units, width: "
                + width + " units, color: "
                + getColor());
    }
}
