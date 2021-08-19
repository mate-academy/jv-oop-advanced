package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.centimeters, side: "
                + getSide() + ", color: " + getColor());
    }
}

