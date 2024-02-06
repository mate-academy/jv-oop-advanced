package core.basesyntax;

public class Square extends Figure {
    private int square;

    public void setSquare(int square) {
        this.square = square;
    }

    @Override
    public double getArea() {
        return square * square;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, square: " + square
                + " units, color: " + getColor());
    }
}
