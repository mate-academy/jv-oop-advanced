package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: Square, area: "
                            + getArea()
                            + " sq.units, side: "
                            + side
                            + " units, color: "
                            + getColor());
    }
}
