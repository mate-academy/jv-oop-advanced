package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;

    public RightTriangle(double sideA, double sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double obtainArea() {
        return (sideA * sideB / 2);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\tLeg A: "
                + sideA
                + "\n\tLeg B: "
                + sideB
                + "\n--------------------");
    }
}
