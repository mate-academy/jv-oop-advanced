package core.basesyntax.figures;

import static core.basesyntax.RandomInt.getRandomInt;

import core.basesyntax.Figure;

public class Square extends Figure {

    private int side;
    private String figureName = "square";

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea()
                + " sq.units, side: " + getSide()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setRandomProperties() {
        setSide(getRandomInt(20));
    }
}
