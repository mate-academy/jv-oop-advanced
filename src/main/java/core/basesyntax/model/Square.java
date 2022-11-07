package core.basesyntax.model;

import core.basesyntax.model.abstraction.Color;
import core.basesyntax.model.abstraction.Figure;

public class Square extends Figure {
    private int oneSide;

    public Square(Color color, int oneSide) {
        super(color);
        this.oneSide = oneSide;
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
    public void draw() {
        System.out.println("Figure: " + "square" + ", area: "
                + getArea() + " sq.units, side: "
                + getOneSide() + " units, color: "
                + getColor().name().toLowerCase());
    }
}
