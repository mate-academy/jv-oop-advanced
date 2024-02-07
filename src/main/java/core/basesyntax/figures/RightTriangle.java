package core.basesyntax.figures;

public class RightTriangle extends GeometricFigure {
    private int side;
    private int height;

    public RightTriangle(String color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * side * height;
    }

    @Override
    public void draw() {
        System.out.println("GeometricFigure: right triangle, area: "
                + getArea() + " sq.units, sides: " + side + " units, "
                + "height: " + height + " units, color: " + getColor());
    }
}
