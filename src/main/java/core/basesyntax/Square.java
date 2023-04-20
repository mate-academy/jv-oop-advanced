package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: square, area: " + calculateArea()
                + ", side: " + side
                + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
