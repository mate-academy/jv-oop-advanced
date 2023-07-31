package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: square, area: ").append(getArea())
                .append(" sq.units, side: ").append(side)
                .append(" units, color: ").append(color.toLowerCase());
        return builder.toString();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
