package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\tSide A = B = C: "
                + side
                + "\n--------------------");
    }
}
