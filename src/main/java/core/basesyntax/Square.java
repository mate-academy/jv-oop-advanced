package core.basesyntax;

public class Square extends Figure {
    private double edge;

    public Square(Color color, double edge) {
        super(color);
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, edge: " + edge
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return edge * edge;
    }
}
