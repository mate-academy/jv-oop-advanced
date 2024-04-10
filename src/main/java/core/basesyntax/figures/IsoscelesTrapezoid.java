package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double obtainArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\tSide A: "
                + sideA
                + "\n\tSide B: "
                + sideB
                + "\n\tHeight H: "
                + height
                + "\n--------------------");
    }
}
