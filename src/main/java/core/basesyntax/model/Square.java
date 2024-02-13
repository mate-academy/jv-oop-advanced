package core.basesyntax.model;

public class Square extends Figure {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea()
                + " sq. units, side: "
                + side
                + " units, color: "
                + getColor());
    }
}
