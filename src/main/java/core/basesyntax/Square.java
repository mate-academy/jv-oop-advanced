package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("I am " + getColor()
                + " square, my side is " + side
                + " and my area is " + String.format("%.2f", getArea()));
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
