package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((side * side) * (Math.sqrt(3))) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + getArea() + " sq.units, 3 side: "
                + side + " units, color: " + getColor());
    }
}
