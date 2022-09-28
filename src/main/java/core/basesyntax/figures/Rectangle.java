package core.basesyntax.figures;

import core.basesyntax.abstraction.Figure;

public class Rectangle extends Figure {

    protected final int sizeOfTopSide;
    private final int sizeOfLateralSide;

    public Rectangle(String color, int sizeOfTopSide, int sizeOfLateralSide) {
        super(color);
        this.sizeOfTopSide = sizeOfTopSide;
        this.sizeOfLateralSide = sizeOfLateralSide;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea() + " sq.units,"
                + " top side: " + sizeOfTopSide + ", lateral side: " + sizeOfLateralSide
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return sizeOfLateralSide * sizeOfTopSide;
    }
}
