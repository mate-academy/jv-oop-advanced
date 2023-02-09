package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int calculateArea() {
        return side * 2;
    }
}
