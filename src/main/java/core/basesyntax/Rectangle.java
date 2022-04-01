package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(String color, String name, double side1, double side2) {
        super(color, name);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (side1 * side2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.name + " area: " + getArea()
                + " side1: " + side1 + " side2: " + side2 + " color: " + color);
    }
}
