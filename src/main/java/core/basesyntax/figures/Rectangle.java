package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Rectangle extends Figure {
    private int sideOne;
    private int sideTwo;

    {
        name = "rectangle";
    }

    public Rectangle(int sideOne, int sideTwo, Color color) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.color = color.name().toLowerCase();
    }

    public int getSideOne() {
        return this.sideOne;
    }

    public int getSideTwo() {
        return this.sideTwo;
    }

    @Override
    public String drawFigure() {
        return super.drawFigure()
                + "side one: "
                + getSideOne()
                + " units, "
                + "side two: "
                + getSideTwo()
                + " units";
    }

    @Override
    public void findArea() {
        this.area = getSideOne() * getSideTwo();
    }
}
