package core.basesyntax.figures;

import core.basesyntax.model.Figure;

public class Square extends Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %.1f sq.units, " + "side: %.1f units, color: %s%n",
                calculateArea(), this.getSide(), this.getColor());
    }
}
