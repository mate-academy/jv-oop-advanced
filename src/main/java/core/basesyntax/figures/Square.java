package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Square extends Figure {
    private int side;

    public Square(String name, int side, Color color) {
        super(name, color);
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    @Override
    public String drawFigure() {
        return super.drawFigure()
                + "side: "
                + getSide()
                + " units";
    }

    @Override
    public void findArea() {
        area = Math.pow(getSide(), 2);
    }
}
