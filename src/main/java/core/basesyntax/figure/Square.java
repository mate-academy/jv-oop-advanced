package core.basesyntax.figure;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Side: " + side);
        super.draw();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
