package core.basesyntax;

public class Square extends Figure {
    private double side;  // pole prywatne

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + name
                + ", Figure area: " + calculateArea()
                + ", Figure parameters: side=" + side
                + ", Figure color: " + color);
    }
}
