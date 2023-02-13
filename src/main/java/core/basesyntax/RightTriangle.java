package core.basesyntax;

public class RightTriangle extends Figure {
    private final int side1;
    private final int side2;

    public RightTriangle(String color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + calculateArea()
                + " sq.points, side1: "
                + side1 + " units, side2: " + side2
                + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return side1 * side2 / 2;
    }
}
