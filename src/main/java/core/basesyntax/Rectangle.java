package core.basesyntax;

public class Rectangle extends Figure {
    private double side;

    public Rectangle(String color, String name, double side) {
        super(color, name);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + " area: " + calculateArea()
                + " side: " + side + " color: " + color);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
