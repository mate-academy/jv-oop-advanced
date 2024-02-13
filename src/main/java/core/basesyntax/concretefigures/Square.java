package core.basesyntax.concretefigures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

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
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " units, side: " + getSide()
                + " units, color: " + getColor());
    }
}
