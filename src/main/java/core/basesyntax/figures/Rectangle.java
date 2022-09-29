package core.basesyntax.figures;

import core.basesyntax.abstraction.Figure;

public class Rectangle extends Figure {
    private final int sizeOfTopSide;
    private final int sizeOfLateralSide;

    public Rectangle(String color, int sizeOfTopSide, int sizeOfLateralSide) {
        super(color);
        this.sizeOfTopSide = sizeOfTopSide;
        this.sizeOfLateralSide = sizeOfLateralSide;
    }

    @Override
    public double getArea() {
        return sizeOfLateralSide * sizeOfTopSide;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String figureName = "rectangle";
        return "Figure: " + figureName + " area: " + getArea() + " sq.units,"
                + " top side: " + sizeOfTopSide + ", lateral side: " + sizeOfLateralSide
                + " units, color: " + getColor();
    }
}
