package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        builder.append("Square, area: ")
                .append(getArea()).append(" sq.units, ")
                .append("side: ")
                .append(side)
                .append(" units, ")
                .append("color: ")
                .append(getColor());
        System.out.println(builder);
    }
}
