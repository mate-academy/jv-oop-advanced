package core.basesyntax;

public class Square extends Figure implements FigureArea {

    private int side;

    public Square() {

    }

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double areaCalculator() {
        return side * side;
    }

    @Override
    public void drawInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: square, area: ").append(areaCalculator())
                .append(" sq.units, side: ").append(side)
                .append(" units, color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
