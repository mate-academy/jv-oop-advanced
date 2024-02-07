package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }
}
