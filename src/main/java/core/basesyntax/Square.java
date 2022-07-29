package core.basesyntax;

public class Square extends Figure {
    private double edge;

    public Square(double edge, Color color) {
        super(color);
        this.edge = edge;
    }

    @Override
    public String draw() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }

    @Override
    public double getArea() {
        return edge * edge;
    }

}
