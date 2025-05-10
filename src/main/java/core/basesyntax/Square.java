package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + FigureName.SQUARE.name()
                + ", area: " + getArea()
                + ", sq.units, side: " + side
                + ", units, color: " + getColor().name());
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
