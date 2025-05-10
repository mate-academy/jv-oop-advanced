package core.basesyntax;

public class Square extends Figure {
    private double edge;

    public Square(double edge, Color color) {
        super(Color.valueOf(color.toString()));
        this.edge = edge;
    }

    @Override
    public String draw() {
        return "Figure: square, "
                + "area: " + getArea() + " sq.units, "
                + "edge: " + edge + " units, "
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return edge * edge;
    }

}
