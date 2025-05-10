package core.basesyntax.model;

public class Square extends Figure {
    private int side;

    public Square() {
    }

    public Square(Color color) {
        super(color);
    }

    public Square(Color color, int side) {
        this(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + calculateArea() + " sq.units, side = "
                + getSide() + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
