package core.basesyntax;

public class RightTriangle extends Figure {
    private final int side;

    public RightTriangle(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, Side = " + side + ", Color: " + color);
    }

    @Override
    public double getArea() {
        return 0.25 * Math.sqrt(3) * side * side;
    }
}
