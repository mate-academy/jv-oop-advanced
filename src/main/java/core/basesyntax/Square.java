package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double areaFigure() {
        return side * side;
    }

    public double diagonal() {
        return 1.41 * side;
    }

    @Override
    public String drawn() {
        return "Figure: square, area: " + areaFigure() + " sq. units, diagonal: "
                + diagonal() + " units, color: " + getColor();
    }
}
