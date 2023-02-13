package core.basesyntax;

public class RightTriangle extends Figure {
    private final int adjacentSide;
    private final int oppositeSide;

    public RightTriangle(String color, int adjacentSide, int oppositeSide) {
        super(color);
        this.adjacentSide = adjacentSide;
        this.oppositeSide = oppositeSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + calculateArea()
                + " sq.points, side1: "
                + adjacentSide + " units, side2: " + oppositeSide
                + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return adjacentSide * oppositeSide / 2;
    }
}
