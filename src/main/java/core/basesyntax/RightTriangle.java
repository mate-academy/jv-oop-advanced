package core.basesyntax;

public class RightTriangle extends Figure {
    private final double side1;

    private final double side2;

    public RightTriangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (side1 * side2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea()
                + " sq. units, side1: " + side1
                + " sq. units, side2: " + side2
                + " units, color: " + getColor());
    }
}
