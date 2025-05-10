package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, Color: " + getColor().name());       
    }
}
