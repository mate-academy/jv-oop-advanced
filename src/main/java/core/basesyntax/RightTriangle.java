package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle() {
    }

    public RightTriangle(double side, double area, String color) {
        super(color, area);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("right triangle, " + "area: " + getArea() + " sq.units, "
                + "side " + side + " units, " + "color: " + getColor());
    }
}
