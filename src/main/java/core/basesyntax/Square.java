package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea() + " sq.units, side: " + side
                + " units, color: " + getColor().toLowerCase();
    }
}

