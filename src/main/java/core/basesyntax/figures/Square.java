package core.basesyntax.figures;

import core.basesyntax.util.Figure;

public class Square extends Figure {
    private Double side;

    public Square() {
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + ", side: " + getSide() + ", color: " + getColor());
    }
}
