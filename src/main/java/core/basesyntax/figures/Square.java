package core.basesyntax.figures;

import core.basesyntax.Color;

public class Square extends Figure {
    private final String name = "square";
    private double side;

    public Square(Color color, double side) {
        super.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name +
                ", area: " + getArea() +
                " sq.units, side: " + side +
                " units, color: " + color.name().toLowerCase());
    }
}
