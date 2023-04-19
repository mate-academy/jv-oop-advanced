package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void printInfo() {
        setArea(side * side);
        System.out.println("Figure: square, area: " + getArea() + ", side: " + side + ", color: " + getColor());
    }
}
