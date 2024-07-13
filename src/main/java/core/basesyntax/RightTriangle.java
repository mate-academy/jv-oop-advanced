package core.basesyntax;

public class RightTriangle extends Figure {
    private final int side;
    private final int base;

    public RightTriangle(int side, int base, String color) {
        super(color);
        this.side = side;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return side * base / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + ", first leg: " + side + ", second leg: " + base
                + ", color: " + getColor());
    }
}
