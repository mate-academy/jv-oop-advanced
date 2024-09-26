package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;

    }

    @Override
    public void draw() {
        System.out.println("Figure: Square");
        System.out.println("Color: " + getColor());
        System.out.println("Side length: " + side);
        System.out.println("Area: " + getArea());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
