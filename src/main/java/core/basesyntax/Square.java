package core.basesyntax;

public class Square extends Figure {
    public static final int MAX_SIDE;

    static {
        MAX_SIDE = 100;
    }

    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("\nSquare with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println("side:" + side + "\n");
    }
}
