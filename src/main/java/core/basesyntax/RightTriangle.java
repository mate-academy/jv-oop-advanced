package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;
    private double height;

    public RightTriangle(String color, double side) {
        super(color);
        this.side = side;
        this.height = side * Math.sqrt(3) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq.units, side: " + side + " units, height: "
                + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * side * height;
    }
}
