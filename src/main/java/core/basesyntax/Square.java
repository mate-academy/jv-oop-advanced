package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, Side = " + side + ", Color: " + color);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
