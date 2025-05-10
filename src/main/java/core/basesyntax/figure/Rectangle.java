package core.basesyntax.figure;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(Color color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        String color = getColor().name().toLowerCase();
        String info = "Figure: rectangle, "
                + "area: " + getArea()
                + " sq.units, length: " + length
                + " units, width: " + width
                + " units, color: " + color;
        System.out.println(info);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
