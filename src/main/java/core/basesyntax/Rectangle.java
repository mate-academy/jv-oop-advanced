package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double length;

    public Rectangle(Color color, double height, double length) {
        super(color);
        this.height = height;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, edgeHeight: " + height + " units, edgeLength: "
                + length + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return height * length;
    }
}
