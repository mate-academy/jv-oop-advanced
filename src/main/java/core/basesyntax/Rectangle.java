package core.basesyntax;

public class Rectangle extends Figure {
    private final int width;
    private final int length;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.width = firstSide;
        this.length = secondSide;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq.units, width: "
                + width + ", length: " + length + " units, color: " + getColor());
    }
}
