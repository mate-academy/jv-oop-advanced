package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("\nSquare with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println("side:" + side + "\n");
    }
}
