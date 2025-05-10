package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Square: Color: " + getColor()
                + ", Side: " + side
                + ", Area: " + calculateArea() + "\n");
    }
}
