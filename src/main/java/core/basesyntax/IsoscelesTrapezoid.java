package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerTrapezoid;
    private int upperTrapezoid;
    private int side;

    public IsoscelesTrapezoid(String color, int upperTrapezoid, int lowerTrapezoid, int side) {
        super(color);
        this.upperTrapezoid = upperTrapezoid;
        this.lowerTrapezoid = lowerTrapezoid;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * (upperTrapezoid * lowerTrapezoid) / 2;
    }

    @Override
    public void drawInfo() {
        System.out.println(String.format(
                "Figure: %s, area: %s sq.units, lowerTrapezoid: %d units, upperTrapezoid:"
                + " %d units, side: %d units, color: %s",
                getClass().getSimpleName(), getArea(),
                lowerTrapezoid, upperTrapezoid, side, getColor()));
    }
}
