package core.basesyntax;

public class Rectangle extends Figure {
    private final double side1;
    private final double side2;

    public Rectangle(double side1, double side2, Color color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;

    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void getPrintInfo() {
        System.out.println("Figure: Rectangle " + ", area: " + getArea()
                + ", side1: " + side1 + ", side2: " + side2 + ", color: " + getColor());
    }
}
