package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Figure: Square, ").append("area: ")
                .append(Double.valueOf(getArea()).toString()).append(" sq.units, side: ")
                .append(Integer.valueOf(side).toString()).append(" units, color: ")
                .append(getColor()).toString();
    }
}
