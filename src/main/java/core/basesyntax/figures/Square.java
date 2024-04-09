package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return super.draw()
                + "\n\tSide : "
                + side
                + "\n--------------------";
    }
}
