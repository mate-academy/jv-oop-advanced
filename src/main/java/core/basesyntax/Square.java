package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return super.draw() + System.out.printf("Side: %s", side);
    }
}
