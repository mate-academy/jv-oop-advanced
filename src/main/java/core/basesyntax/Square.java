package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, String name, double side) {
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
