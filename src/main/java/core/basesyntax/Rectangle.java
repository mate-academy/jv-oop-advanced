package core.basesyntax;

public class Rectangle extends Figures {
    private final double width;
    private final double length;

    public Rectangle(Color color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "Rectangle, "
                + "area: " + getArea() + " sq.units, "
                + "width: " + width + "units, "
                + "length: " + length + "units, "
                + "color: " + getColor());
    }
}
