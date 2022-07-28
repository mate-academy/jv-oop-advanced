package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public float areaOfFigure() {
        return (float) (Math.sqrt(3) * side * side) / 4;
    }

    @Override
    public void drawFigure() {
        StringBuilder sb = new StringBuilder();
        System.out.println(
                sb.append("Figure: RightTriangle, area: ")
                        .append(areaOfFigure())
                        .append(" sq.units, side: ")
                        .append(side)
                        .append(" units, color: ")
                        .append(getColor()));
    }
}
