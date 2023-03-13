package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder("Figure: square, ")
                        .append("area: ")
                        .append(String.format("%.1f", getArea()))
                        .append(" sq.units, side: ")
                        .append(side)
                        .append(" units, color: ")
                        .append(getColor().toLowerCase())
        );
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
