package core.basesyntax;

public class Square extends Figure {
    private final int side;
    private int squareArea;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square; color: " + color
                + "; side: " + side
                + "; area: " + getArea());
    }
}
