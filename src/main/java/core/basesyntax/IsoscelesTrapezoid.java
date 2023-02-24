package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int side1;
    private final int side2;
    private final int height;

    public IsoscelesTrapezoid(int side1, int side2, int height, Color color) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        super.color = color;
    }

    private double getArea() {
        return ((side1 + side2 / 2 * height));
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + " sq.units, side1: "
                + side1 + " units" + " side2 " + side2 + " units" + " height "
                + height + " units," + "color: " + super.color);
    }
}
