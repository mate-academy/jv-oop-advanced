package core.basesyntax.figure;

import core.basesyntax.color.Color;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    public Square(Color color, double side) {
        this.color = color.name().toLowerCase();
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        String str = "Figure: square, area: " + getArea() + " sq.units, side: "
                + side + ", color: " + color;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
