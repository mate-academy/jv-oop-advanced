package core.basesyntax.figure;

import core.basesyntax.template.Figure;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
