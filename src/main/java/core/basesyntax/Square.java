package core.basesyntax;

public class Square extends Figure {
    private final int side;
    private int squareArea;

    public Square(String color, int side) {
        super(color);
        this.side = side;
        getArea();
        draw();
    }

    @Override
    public double getArea() {
        squareArea = side * side;
        return squareArea;

    }

    @Override
    public void draw() {
        System.out.println("Figure: square; color: " + color
                + "; side: " + side
                + "; area: " + squareArea);
    }
}
