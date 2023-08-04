package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side
                + " units, color:" + getColor());
    }
}

