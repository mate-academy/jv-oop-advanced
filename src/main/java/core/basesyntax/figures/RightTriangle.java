package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureType;

public class RightTriangle extends Figure {
    private final int sideA;
    private final int sideB;
    private final String color;

    public RightTriangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.RIGHTTRIANGLE.name()
                    + ", area: " + area() + " sq. units"
                + ", firstLeg: " + sideA + " units, " + "secondLeg: " + sideB + " units, "
                + "color: " + color);
    }

    @Override
    public double area() {
        return (double) (sideA * sideB) / 2;
    }
}
