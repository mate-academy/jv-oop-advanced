package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + calculateArea()
                + " sq.units, side: "
                + getSide()
                + " units, color: "
                + getColor().name().toLowerCase());
    }

    public int getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
