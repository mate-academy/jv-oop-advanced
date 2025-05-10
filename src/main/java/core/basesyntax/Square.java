package core.basesyntax;

public class Square extends Figure {

    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    void draw() {
        System.out.println("Figure: Square");
        System.out.println("Color: " + getColor());
        System.out.println("Side length: " + side);
    }
}
