package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(COLOR COLOR, double side) {
        super(COLOR);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void getArea() {
        System.out.println("Square colour " + getColor() + " side " + side);
    }
}
