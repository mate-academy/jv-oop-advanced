package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        this.side = side;
        setColor(Colors.valueOf(color));
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor().name().toLowerCase());
    }
}
