package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side * side) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
