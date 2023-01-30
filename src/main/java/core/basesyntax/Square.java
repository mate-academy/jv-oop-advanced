package core.basesyntax;

public class Square extends Figure {
    private int side;

    {
        setFigureType("square");
    }

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    double countArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: "
                + getFigureType() + ", area: "
                + countArea() + " sq.units, side: "
                + side + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
