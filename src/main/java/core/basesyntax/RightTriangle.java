package core.basesyntax;

public class RightTriangle extends Figure {
    public static final double CONSTANT = 0.5;
    private double bisector;
    private double side;

    public RightTriangle(Color color, double side, double bisector) {
        super(color);
        this.side = side;
        this.bisector = bisector;
    }

    @Override
    public double areaCalculator() {
        return side * bisector * CONSTANT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + areaCalculator()
                + " sq.units, side: " + side + " units, bisector: " + bisector + " units, color: "
                + getColor());
    }
}

