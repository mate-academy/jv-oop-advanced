package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println(new StringBuilder().append("Figure: square, area: ").append(getArea())
                .append(" sq.units, side: ").append(side).append(" units, color: ")
                .append(getColor()).toString());
    }
}
