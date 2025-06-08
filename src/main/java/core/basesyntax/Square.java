package core.basesyntax;

public class Square extends Figure {
    double side;

    public Square(String color, double width) {
        this.color = color;
        this.side = width;

    }
    @Override
    double getArea() {
        return side * side;
    }

    @Override
    void draw() {
        System.out.println("Figure: square, area: " + getArea() +
                " sq. units, width: " + side +
                " units, length: " + side +
                " units, color: " + color);
    }
}