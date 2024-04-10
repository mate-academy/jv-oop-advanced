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
    public void draw() {
        super.draw();
        System.out.println("\tSide : "
                + side
                + "\n--------------------");
    }
}
