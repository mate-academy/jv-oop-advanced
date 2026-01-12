package core.basesyntax.Figures;

import core.basesyntax.Interfaces.Draweble;

public class Square extends Figure {
    private final int side;


    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String drawing() {
        return "Figure: square, area: "
                + this.getArea()
                + " sq. units, side: "
                + side
                + " units, color: "
                + super.getColor();
    }
}

