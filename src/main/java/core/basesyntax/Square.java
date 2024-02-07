package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, "
                + "area: " + Math.floor(getArea()) + " sq.units, "
                + "side: " + side + " units"
                + ", color: " + getColor().name().toLowerCase());
    }
}
