package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public float areaOfFigure() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        StringBuilder sb = new StringBuilder();
        System.out.println(
                sb.append("Figure: square, area: ")
                        .append(areaOfFigure())
                        .append(" sq.units, side: ")
                        .append(side)
                        .append(" units, color: ")
                        .append(getColor()));
    }
}
