package core.basesyntax;

public class RightTriangle extends Figure {
    private final int side1;
    private final int side2;

    public RightTriangle(int side1, int side2, String color) {
        this.side1 = side1;
        this.side2 = side2;
        super.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: " + getArea() + " sq.units, side1: "
                + side1 + " units " + "side2 " + side2 + " units " + ", color: " + super.color);
    }

    private double getArea() {
        return (side1 * side2) / 2;
    }
}
