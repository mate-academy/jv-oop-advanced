package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square is drawn. Color is " + color + " Side = " + side);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
