package core.basesyntax.model;

public class Square extends Figure implements AreaCalculator {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Figure: square, area: ").append(getArea())
                .append(" sq.units, side: ").append(side)
                .append(" units, color: ").append(getColor()).toString();
    }
}
