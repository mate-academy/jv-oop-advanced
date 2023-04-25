package core.basesyntax;

public class Square extends AbstractFigure {
    private final double side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        System.out.println("Figure: square, area: "
                + getArea() + " sq.units, side: "
                + side + " units, color: "
                + getColor());
        return null;
    }
}
