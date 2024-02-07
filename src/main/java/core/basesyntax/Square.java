package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, int side) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder("Figure: Square, area: ");
        sb.append(getArea())
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(color);
        return sb.toString();
    }
}
