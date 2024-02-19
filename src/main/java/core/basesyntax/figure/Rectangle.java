package core.basesyntax.figure;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea()
                + " sq. units, length: "
                + length
                + " units, width: "
                + width
                + " units, color: "
                + getColor());
    }
}
