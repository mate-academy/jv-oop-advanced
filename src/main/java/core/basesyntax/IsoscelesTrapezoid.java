package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBasis;
    private double bottomBasis;
    private double side;

    public IsoscelesTrapezoid(Color color, double topBasis, double bottomBasis, double side) {
        super(color);
        this.topBasis = topBasis;
        this.bottomBasis = bottomBasis;
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((bottomBasis + topBasis) / 2) * (Math.sqrt((side * side)
                - ((bottomBasis - topBasis) * (bottomBasis - topBasis)) / 4));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, topBasis:"
                + topBasis + " units, bottomBasis:" + bottomBasis
                + " units, side:" + side + " units, color:" + getColor());
    }
}
