package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Square extends Figure {
    private int side;

    {
        name = "square";
    }

    public Square(int side, Color color) {
        this.side = side;
        this.color = color.name().toLowerCase();
    }

    public int getSide() {
        return this.side;
    }

    @Override
    public String toString() {
        return super.toString()
                + "side: "
                + getSide()
                + " units";
    }

    @Override
    public void findArea() {
        area = Math.pow(getSide(), 2);
    }
}
