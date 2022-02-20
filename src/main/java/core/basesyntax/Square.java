package core.basesyntax;

public class Square extends Figure implements FigureInterfaces {
    public int squareSide;

    public Square(int squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public double getAreaFigure() {
        return squareSide * squareSide;
    }

    @Override
    public void drawFigure() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: square, area: ")
                .append(getArea())
                .append(" sq.units, squareSide: ")
                .append(squareSide)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
