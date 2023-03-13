package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: right triangle, area: ")
                .append(area())
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(getColor());
        return builder.toString();
    }
}
