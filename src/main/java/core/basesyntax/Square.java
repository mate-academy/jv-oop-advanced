package core.basesyntax;

public class Square extends Figure {
    private double side;

    Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println(
                new StringBuilder("Figure: square, area: ")
                .append(String.format("%.1f", getArea()))
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(super.getColor().toLowerCase())
                .toString()
        );
    }
}
