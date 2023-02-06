package core.basesyntax.figuretypes;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = Math.pow(side, 2);
        return Math.round(area * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, "
                + "area: " + getArea() + " units, "
                + "side: " + side + " units, "
                + "color: " + color);
    }
}
