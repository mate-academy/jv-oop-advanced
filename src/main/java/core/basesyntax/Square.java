package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square{" + "side=" + side
                + ", color='" + getColor() + '\''
                + ", area=" + getArea() + '}');
    }
}
