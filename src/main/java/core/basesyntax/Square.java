package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor());
    }

}
