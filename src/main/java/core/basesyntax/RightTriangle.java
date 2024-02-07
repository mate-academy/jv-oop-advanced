package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;
    private int height;

    public RightTriangle(Color color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (side * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor().name());
    }
}
