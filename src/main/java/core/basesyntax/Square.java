package core.basesyntax;

import model.Figure;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
        print();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println("Figure: Square, area:  " + calculateArea()
                + " sq. units, side: " + side + " units, color: " + color);
    }
}
