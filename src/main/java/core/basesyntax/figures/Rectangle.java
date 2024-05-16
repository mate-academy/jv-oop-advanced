package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(String color, int length, int width) {
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
                + calculateArea() + " sq. units, length: "
                + length + " units, width: "
                + width + " units, color: "
                + getColor());
    }
}
