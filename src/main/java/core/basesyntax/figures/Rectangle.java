package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double obtainArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\tSide A = С: "
                + sideA
                + "\n\tSide B = D: "
                + sideB
                + "\n--------------------");
    }
}
