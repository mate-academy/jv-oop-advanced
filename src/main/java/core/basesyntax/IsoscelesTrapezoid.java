package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topSide;
    private final double lowSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double topSide, double lowSide, double height) {
        super(color);
        this.topSide = topSide;
        this.lowSide = lowSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea()
                + " sq.units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * (topSide + lowSide) * height;
    }
}
