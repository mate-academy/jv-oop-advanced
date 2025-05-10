package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.width = firstSide;
        this.length = secondSide;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, width: "
                + width + " units, length: " + length + " units, color: " + getColor());
    }
}
