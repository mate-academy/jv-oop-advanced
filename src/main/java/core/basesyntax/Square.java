package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getInfo() {
        System.out.printf("Figure: square, area: %s sq.units, side: %s units, color: %s%n",
                 getArea(), side, getColor());
    }
}
