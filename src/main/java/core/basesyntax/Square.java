package core.basesyntax;

public class Square extends Figure {
    private final double side;

    Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("This is a square. It is " + color + " and has a side of " + side);
    }
}
