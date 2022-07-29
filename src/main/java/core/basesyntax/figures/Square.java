package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class Square extends Figure {
    private double side;
    private double figureArea;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void getArea() {
        figureArea = (Math.pow(side, 2));
    }

    @Override
    public void draw() {
        getArea();
        System.out.println("Square, area: " + figureArea + ", side: " + side
                + ", color: " + getColor());
    }
}
