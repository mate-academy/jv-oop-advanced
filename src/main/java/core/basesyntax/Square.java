package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, Color=" + getColor()
                + ", side=" + side
                + ", area=" + getArea());
    }
}
