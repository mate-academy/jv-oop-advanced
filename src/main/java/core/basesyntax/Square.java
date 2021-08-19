package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String figureColor, int side) {
        super(figureColor);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        StringBuilder squareStringBuilder = new StringBuilder();
        String area = String.format("%.2f", obtainArea()).replace(',', '.');
        squareStringBuilder.append("Figure: square, color: ").append(getFigureColor())
                .append(", side: ").append(side).append(" units")
                .append(", area: ").append(area).append(" sq.units");
        System.out.println(squareStringBuilder);
    }
}
