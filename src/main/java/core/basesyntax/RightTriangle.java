package core.basesyntax;

public class RightTriangle extends Figure {
    private double bisector;
    private double side;

    public RightTriangle(Color color, double side, double bisector) {
        super(color);
        this.side = side;
        this.bisector = bisector;
    }

    @Override
    public double getArea() {
        return side * bisector * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, side: " + side + " units, bisector: " + bisector + " units, color: "
                + getColor());
    }
}
