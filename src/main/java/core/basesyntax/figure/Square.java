package core.basesyntax.figure;

import core.basesyntax.Color;

public class Square extends Rectangle {
    private final int side;
    public Square(int side, Color color) {
        super(side, side, color);
        this.side = side;
    }

    @Override
    public String showInformation(){
        return String.format("Figure: square, area: %f sq. units, side: %d units, color: %s", countArea(), side, super.color.name().toLowerCase());
    }
}
