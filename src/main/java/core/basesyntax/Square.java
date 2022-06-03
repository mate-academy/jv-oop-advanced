package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.floor(side * side);
    }

    @Override
    public void draw() {
        System.out.println("square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor());
    }
}
