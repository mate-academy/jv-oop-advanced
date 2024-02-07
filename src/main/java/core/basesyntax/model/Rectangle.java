package core.basesyntax.model;

public class Rectangle extends Figure {
    private final int length;
    private final int width;
    private String color;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + calculateArea()
                + " sq.units, length: "
                + length
                + " units, width: "
                + width
                + " units, color: "
                + getColor());
    }
}
