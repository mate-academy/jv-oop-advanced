package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArea()
                + " sq.units, side: "
                + getSide()
                + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
