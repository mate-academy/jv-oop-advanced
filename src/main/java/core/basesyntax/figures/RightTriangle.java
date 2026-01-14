package core.basesyntax.figures;

import core.basesyntax.enums.FigureType;

public class RightTriangle extends Figure {
    private final int legA;
    private final int legB;
    private final int hypotenuse;

    public RightTriangle(int leg, int hypotenuse) {
        this.legA = leg;
        this.legB = leg;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return legA * legB / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "+ FigureType.RIGHT_TRIANGLE + ", area: "
                + this.getArea()
                + " sq. units, legA: "
                + legA
                + " units, legB: "
                + legB
                + " units, hypotenuse: "
                + hypotenuse
                + " units, color: "
                + super.getColor());
    }
}

