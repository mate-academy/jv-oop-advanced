package core.basesyntax.model;

import core.basesyntax.model.abstraction.Color;

public class Rectangle extends Square {
    private int secondSide;

    public Rectangle(Color color, int oneSide, int secondSide) {
        super(color, oneSide);
        this.secondSide = secondSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (getOneSide() * getSecondSide());
    }

    @Override
    public String drawFigure() {
        return "Figure: " + figureType + ", area: " + getArea() + " sq.units, one side: "
                + getOneSide() + " units, second side: " + getSecondSide() + " color: "
                + getColor().toString().toLowerCase();
    }
}
