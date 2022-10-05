package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int baseOfaTrapezoid;
    private final int sides;
    private final int height;

    public IsoscelesTrapezoid(String color, int baseOfaTrapezoid, int sides, int height) {
        super(color);
        this.baseOfaTrapezoid = baseOfaTrapezoid;
        this.sides = sides;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((baseOfaTrapezoid + sides) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + getArea() + " sq.units, baseOfaTrapezoid: "
                + baseOfaTrapezoid + " units, sides: " + sides
                + " units, height: " + height + " units color: " + getColor());
    }
}
