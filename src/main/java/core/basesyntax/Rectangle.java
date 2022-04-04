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
    public double area() {
        return length * width;
    }

    @Override
    public String getRandomParameters() {
        return "Figure: rectangle, area: " + area()
                + "sq.units, length: " + length
                + " units, width: " + width
                + " units, color: " + color;
    }
}
