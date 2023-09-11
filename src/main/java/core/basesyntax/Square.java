package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public int areaCalculation() {
        return side * side;
    }

    @Override
    public void ableToDraw() {
        System.out.println("Figure: square, area: " + areaCalculation()
                + " sq.units, side: " + side + " units, color: " + color.name());
    }
}
