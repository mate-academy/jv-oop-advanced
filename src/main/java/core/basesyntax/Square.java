package core.basesyntax;

public class Square extends Rectangle {
    private int side;
    private double diagonal;

    public Square(Colour colour, int side) {
        super(colour, side, side);
        this.diagonal = side * Math.sqrt(2);
        this.perimeter = 4 * side;
    }

    public Square(Colour colour, int weight, int height) throws Exception {
        super(colour, weight, height);
        if (weight != height) {
            throw new Exception();
        }
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq.units, side: " + getSide() + ", perimeter: "
                + getPerimeter() + ", diagonal: " + diagonal
                + ", colour: " + getColour());
    }

    public int getSide() {
        return side;
    }
}
