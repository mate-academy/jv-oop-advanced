package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(String color, int length, int width) {
        this.width = width;
        this.length = length;
        setColor(Colors.valueOf(color));
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, length: " + length
                + " units, width: " + width
                + " units, color: " + getColor().name().toLowerCase());
    }
}
