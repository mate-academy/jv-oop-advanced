package core.basesyntax;

public class Square extends Figure {
    private double edge;

    public Square(double edge, String color) {
        super(Color.valueOf(color));
        this.edge = edge;
    }

    @Override
    public String draw() {
        return "Figure: square, "
                + "area: "  + getArea() + " sq.units, "
                + "edge: "  + edge      + " sq.units, "
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return edge * edge;
    }

}
