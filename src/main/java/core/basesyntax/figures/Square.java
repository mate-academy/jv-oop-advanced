package core.basesyntax.figures;

import core.basesyntax.variables.Color;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
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
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Figure: square"
                + ", area: " + calculateArea()
                + " sq. units"
                + ", side: " + getSide()
                + ", color: " + getColor();
    }
}
