package core.basesyntax.figures;

public class Square  extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + obtainArea()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
