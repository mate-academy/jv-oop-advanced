package core.basesyntax.model;

import core.basesyntax.model.abstraction.Color;
import core.basesyntax.model.abstraction.Figure;

public class Rectangle extends Figure {
    private int oneSide;
    private int secondSide;

    public Rectangle(Color color, int oneSide, int secondSide) {
        super(color);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
    }

    public int getOneSide() {
        return oneSide;
    }

    public void setOneSide(int oneSide) {
        this.oneSide = oneSide;
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
    public void draw() {
        System.out.println("Figure: " + "rectangle" + ", area: "
                + getArea() + " sq.units, one side: "
                + getOneSide() + " units, second side: "
                + getSecondSide() + " color: "
                + getColor().name().toLowerCase());
    }
}
