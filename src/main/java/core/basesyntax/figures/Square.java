package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + obtain() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }

    @Override
    public double obtain() {
        return side * side;
    }
}
