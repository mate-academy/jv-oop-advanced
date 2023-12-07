package core.basesyntax;

public class Square extends Rectangle {
    private int side;

    public Square(Color color, int side) {
        super(color, side, side);
        this.side = side;
    }

    @Override
    public Double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Square:");
    }

    @Override
    public String toString() {
        return ("Color: " + getColor() + ", Side: " + side + ", Area: " + getArea());
    }
}
