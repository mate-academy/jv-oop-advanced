package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4.0) * side * side;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("right triangle, area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + color);
    }
}
