package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculatorArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square"
                + ", area: "
                + calculatorArea() + " sq.units, side: "
                + side + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
