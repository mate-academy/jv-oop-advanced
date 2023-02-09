package core.basesyntax.entity;

public class Square extends Figure {
    public static final int MAX_SIDE = 25;

    public static final double DEFAULT_SIDE = 12.5;
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void printInfo() {
        System.out.println(new StringBuilder("Figure:")
                .append(" Square, area: ")
                .append(side * side / 2)
                .append(" sq.units,")
                .append(" side: ")
                .append(side)
                .append(" units, color: ")
                .append(getColor()));
    }
}
