package core.basesyntax.figures;

import core.basesyntax.state.Figure;

public class Square extends Figure {
    private int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq. cm, side: %d cm, color: %s\n",
                getName(), getArea(), side, getColor());
    }
}
