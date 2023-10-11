package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        System.out.println("Square{" + "side=" + side
                + ", color='" + getColor() + '\''
                + ", area=" + getArea() + '}');
        return "";
    }
}
