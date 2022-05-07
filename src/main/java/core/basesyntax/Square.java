package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public void toDraw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + getSide()
                + " units, color: " + getColor());
    }
}
