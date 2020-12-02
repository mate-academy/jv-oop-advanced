package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    @Override
    public void draw() {
        System.out.println("Square, area: " + getArea() + " sq.units, side length: "
                + getSide() + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }
}
