package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int breadth;

    public Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + getArea()
                + " sq.units, length: "
                + length
                + " units, breadth: "
                + breadth
                + " units, color: "
                + getColor();
    }
}
