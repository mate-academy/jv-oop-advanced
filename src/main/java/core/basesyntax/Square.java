package core.basesyntax;

public class Square extends GetFigure {
    private static final String NAME = "SQUARE";
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("GetFigure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }
}
