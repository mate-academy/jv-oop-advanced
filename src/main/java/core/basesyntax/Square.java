package core.basesyntax;

public class Square extends Figure {
    double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + name +
                ", Figure area: " + calculateArea() +
                ", Figure parameters: side=" + side +
                ", Figure color: " + color);
    }
}
