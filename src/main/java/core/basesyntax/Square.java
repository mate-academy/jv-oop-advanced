package core.basesyntax;

public class Square extends Figure implements FigureArea {

    private int side;

    public Square() {

    }

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
        public double AreaCalculator() {
            return side * side;
        }

    @Override
        public void drawInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: square, area: ").append(AreaCalculator())
                .append(" sq.units, side: ").append(side)
                .append(" units, color: ").append(color);
        System.out.println(stringBuilder);
    }
}
