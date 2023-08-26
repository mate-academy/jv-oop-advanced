package core.basesyntax;

public class Rectangle extends Figure {
    private final double side1;
    private final double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void draw() {
        String name = "rectangle";
        System.out.println("Figure: " + name + ", area: " + getArea()
                + " sq. units, sideA: " + side1
                + " units, sideB: " + side2 + " units, color: " + getColor());
    }
}
