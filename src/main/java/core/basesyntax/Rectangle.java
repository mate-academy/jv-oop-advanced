package core.basesyntax;

public class Rectangle extends Figure {
    private final double side1;
    private final double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        setFigureType("rectangle");
        this.side1 = side1;
        this.side2 = side2;
        setArea(calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType() + ", area: " + getArea()
                + " sq.units, side1: " + side1 + ", side2: "
                + side2 + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }
}
