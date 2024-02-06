package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return (side * side) * (Math.sqrt(3) / 4);
    }
}
