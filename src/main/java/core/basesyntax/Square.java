package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: square, area ")
                .append(getArea()).append(" sq. units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(color);
        return builder.toString();
    }

}
