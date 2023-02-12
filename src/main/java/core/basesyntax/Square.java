package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.SQUARE
                    + ", area :" + calculateArea()
                    + " sq.units, side:" + side
                    + ", color:" + getColor());

    }
}
