package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        super(Shape.SQUARE, color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getShape() + ", area: " + getArea()
                + " sq.units, side: " + side + " sq.units, color: "
                + getColor().name().toUpperCase());
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
