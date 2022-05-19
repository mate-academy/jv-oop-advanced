package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color, FigureType.SQUARE);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %f, color = %s, Side = %f\n",
                getFigureType().getValue(), calculateArea(), getColor(), side);
    }
}
