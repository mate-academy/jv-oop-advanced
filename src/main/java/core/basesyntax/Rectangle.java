package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double breadth;

    public Rectangle(Color color, double leangth, double breadth) {
        super(color);
        this.length = leangth;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, length: " + length
                + " units, breadth: " + breadth
                + " units, color: " + getColor());
    }
}
