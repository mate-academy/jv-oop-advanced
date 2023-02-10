package core.basesyntax.entity;

public class Square extends Figure {
    public static final double MAX_SIDE = 25;
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
                .append(" Square,")
                .append(System.lineSeparator())
                .append("        area: ")
                .append(getArea())
                .append(" sq.units,")
                .append(System.lineSeparator())
                .append("        side: ")
                .append(side)
                .append(" units,")
                .append(System.lineSeparator())
                .append("        color: ")
                .append(getColor()));
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
