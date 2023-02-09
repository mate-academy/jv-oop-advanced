package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double countArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: square"
                + ", area: " + countArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor().toString().toLowerCase());
    }
}
