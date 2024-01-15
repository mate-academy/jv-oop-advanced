package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;
    private int height;

    public RightTriangle(String color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return side / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, side: "
                + side + " units, height: " + height + " units, color: " + getColor());
    }
}
