package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(Color color, double leangth, double breadth) {
        super(color);
        this.length = leangth;
        this.width = breadth;
    }

    @Override
    public double calculataArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculataArea()
                + " sq.units, length: " + length
                + " units, breadth: " + width
                + " units, color: " + getColor());
    }
}
