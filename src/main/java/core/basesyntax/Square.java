package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side,String color) {
        super(color);
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
        builder.append("Figure: ").append("square, ").append("area: ")
                .append(getArea()).append(" sq.units, ").append("side: ").append(side)
                .append(" units, ").append("color: ").append(getColor());
        return builder.toString();
    }

    @Override
    public String toString() {
        return draw();
    }
}
