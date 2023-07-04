package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;
    private double height;

    public RightTriangle(Color color, double side) {
        super(color);
        this.side = side;
        this.height = side * Math.sqrt(3) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + calculateArea()
                + " sq.units, side: " + side + " units, height: "
                + height + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        final double coefficient = 0.5;
        return coefficient * side * height;
    }
}
