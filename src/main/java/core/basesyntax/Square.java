package core.basesyntax;

public class Square extends Figure {
    private int squareSide;

    public Square(String color, int side) {
        super(color);
        this.squareSide = side;
    }

    @Override
    public double getArea() {
        return Math.pow(squareSide, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, squareSide = " + squareSide
                + ", area = " + getArea() + ", color: " + getRandomColor());

    }
}
