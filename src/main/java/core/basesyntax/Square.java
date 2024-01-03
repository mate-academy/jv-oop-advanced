package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: Square, area: "
                + getArea() + " m^2, side: "
                + side + ", color: "
                + getColor());
    }
}
