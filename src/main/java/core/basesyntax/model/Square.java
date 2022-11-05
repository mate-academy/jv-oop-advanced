package core.basesyntax.model;

import core.basesyntax.model.abstraction.Color;
import core.basesyntax.model.abstraction.Figure;

public class Square extends Figure {
    private int oneSide;

    public Square(Color color, int oneSide) {
        super(color);
        this.oneSide = oneSide;
        getClass().getSimpleName();
    }

    public int getOneSide() {
        return oneSide;
    }

    public void setOneSide(int oneSide) {
        this.oneSide = oneSide;
    }

    @Override
    public double getArea() {
        return oneSide * oneSide;
    }

    @Override
    public String toString() {
        return "Figure: " + figureType + ", area: " + getArea() + " sq.units, side: "
                + getOneSide() + " units, color: " + getColor().toString().toLowerCase();
    }
}
