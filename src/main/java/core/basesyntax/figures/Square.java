package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class Square extends Figure {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Square, area: " + getArea() + ", side: " + side
                + ", color: " + getColor());
    }
}
