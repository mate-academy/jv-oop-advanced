package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side,String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.print("Figure: ");
        System.out.print("Square, ");
        System.out.print("Side - " + side);
        System.out.print(", Area - " + (side * side));
        System.out.print(", Color: " + getColor().toLowerCase() + "\n");
    }
}
