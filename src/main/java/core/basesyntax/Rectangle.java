package core.basesyntax;

public class Rectangle extends Figure {
    private double edgeHeight;
    private double edgeLength;

    public Rectangle(Color color, double edgeHeight, double edgeLength) {
        super(color);
        this.edgeHeight = edgeHeight;
        this.edgeLength = edgeLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, edgeHeight: " + edgeHeight + " units, edgeLength: "
                + edgeLength + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return edgeHeight * edgeLength;
    }
}
