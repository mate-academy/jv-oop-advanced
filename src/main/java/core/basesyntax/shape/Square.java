package core.basesyntax.shape;

import core.basesyntax.Figure;
import core.basesyntax.producers.ColorProducer;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        super(ColorProducer.getColor());
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Shape: square; area: " + getArea() + "; side: " + side
                + "; color: " + getColor();
    }
}
