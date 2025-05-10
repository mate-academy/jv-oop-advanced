package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid"
                + ", area=" + getArea() + " sq.units"
                + "side" + side + " units"
                + ", color=" + getColor());
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
