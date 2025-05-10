package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int height;
    private int side;

    public IsoscelesTrapezoid(String color, int upperTrapezoid, int lowerTrapezoid, int side) {
        super(color);
        this.height = upperTrapezoid;
        this.base = lowerTrapezoid;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * (height * base) / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: %s, area: %s sq.units, base: %d units, height:"
                + " %d units, side: %d units, color: %s",
                getClass().getSimpleName(), getArea(),
                base, height, side, getColor()));
    }
}
