package core.basesyntax;

public class Square extends Figure {
    private final double side;
    private final String color;

    public Square(double side, String color) {
        this. side = side;
        this. color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: Square" + ", Color: " + color + ", area: " + getArea());
    }
}
