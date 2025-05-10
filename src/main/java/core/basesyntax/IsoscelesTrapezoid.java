package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBasis;
    private int bottomBasis;
    private int side;

    public IsoscelesTrapezoid(String color, int topBasis, int bottomBasis, int side) {
        super(color);
        this.topBasis = topBasis;
        this.bottomBasis = bottomBasis;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea() + " sq.units,"
                + " topBasis:" + " " + topBasis + " units, bottomBasis: " + bottomBasis
                + " units, 2 side: " + side + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((bottomBasis + topBasis) / 2) * (Math.sqrt((side * side)
                - ((bottomBasis - topBasis) * (bottomBasis - topBasis)) / 4));
    }
}
