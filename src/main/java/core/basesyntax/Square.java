package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.setColor(color);
        this.side = side;
        super.setType("square");
    }

    public int getSide() {
        return side;
    }

    public Square setSide(int side) {
        this.side = side;
        return this;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getInfo() {
        System.out.printf("Figure: %s, area: %s sq.units, side: %s units, color: %s%n",
                getType(), getArea(), side, getColor());
    }
}
