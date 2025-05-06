package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureType;

public class RightTriangle extends Figure {
    private final int sideA;
    private final int sideB;

    public RightTriangle(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.RIGHTTRIANGLE.name()
                    + ", area: " + area() + " sq. units"
                + ", firstLeg: " + sideA + " units, " + "secondLeg: " + sideB + " units, "
                + "color: " + getColor());
    }

    @Override
    public double area() {
        return (double) (sideA * sideB) / 2;
    }
}
