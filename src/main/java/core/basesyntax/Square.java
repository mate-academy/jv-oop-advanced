package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double getPerimeter() {
        return round(4 * side);
    }

    public double getArea() {
        return round(side * side);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle"
                        + ", side: " + round(side) + " units"
                        + ", area: " + getArea() + " sq. units"
                        + ", perimeter: " + getPerimeter() + " units"
                        + ", color: " + color
        );
    }
}
