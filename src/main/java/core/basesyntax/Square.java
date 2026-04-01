package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square,"
                + " area: " + area()
                + ", color: " + getColor()
                + ", side: " + side);
    }
}
