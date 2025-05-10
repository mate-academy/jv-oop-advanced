package core.basesyntax;

public class Rectangle extends Figure {
    private final int width;
    private final int length;

    public Rectangle(Color color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq.units, "
                + "width: " + width + " units, "
                + "length: " + length + " units, "
                + "color: " + getColor());
    }
}
