package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        this.side = side;
        setColor(Color.valueOf(String.valueOf(color)));
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor().name().toLowerCase());
    }
}
