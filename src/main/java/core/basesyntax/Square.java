package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Square, area = " + findArea()
                + " sq. units, side = " + side
                + " units, color = " + getColor());
    }

    @Override
    public double findArea() {
        return side * side;
    }
}
