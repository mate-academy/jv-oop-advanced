package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double findAreaFigure() {
        return side * side;
    }

    public double findDiagonal() {
        return 1.41 * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + findAreaFigure() + " sq. units, diagonal: "
                + findDiagonal() + " units, color: " + getColor();
    }
}
